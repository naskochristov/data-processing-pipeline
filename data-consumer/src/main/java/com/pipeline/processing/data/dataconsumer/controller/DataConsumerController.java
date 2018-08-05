package com.pipeline.processing.data.dataconsumer.controller;

import com.pipeline.processing.data.dataconsumer.domain.UserData;
import com.pipeline.processing.data.dataconsumer.repository.UserDataRepository;
import com.pipeline.processing.data.dataconsumer.service.UserDataConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dataconsumer")
public class DataConsumerController {

   @Autowired
   private UserDataConsumerService userDataService;

   @RequestMapping(method = RequestMethod.GET, value="/userdata", produces = "application/json")
   public List<UserData> getAllUsers()
   {
        return userDataService.getAllUsers();
   }
}
