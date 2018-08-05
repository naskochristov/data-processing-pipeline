package com.pipeline.processing.data.dataproducer.controller;

import com.pipeline.processing.data.dataproducer.domain.UserData;
import com.pipeline.processing.data.dataproducer.dto.DataProducerRequest;
import com.pipeline.processing.data.dataproducer.message.MessageOutputBinder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/dataproducer")
public class DataProducerController {

    @Autowired
    public MessageOutputBinder messageBinder;

    @RequestMapping(method = RequestMethod.POST, value="/userdata", produces = "application/json")
    public int produceUserData(@RequestBody DataProducerRequest requestData)
    {
        UserData userData = new UserData();

        // re-map data from DTO to domain object
        userData.setUserId(new Random().nextInt(20000));
        userData.setFirstName(requestData.getFirstName());
        userData.setLastName(requestData.getLastName());
        userData.setDateOfBirth(requestData.getDateOfBirth());
        userData.setShortResume(requestData.getShortResume());

        //TODO publish message to rabbitMq
        messageBinder.userDataOutput().send(MessageBuilder.withPayload(userData).build());

        //TODO publish message to websockets

        // return the random generated id
        return userData.getUserId();
    }

}
