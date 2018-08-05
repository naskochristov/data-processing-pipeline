package com.pipeline.processing.data.dataconsumer.service;

import com.pipeline.processing.data.dataconsumer.domain.UserData;
import com.pipeline.processing.data.dataconsumer.message.MessageInputBinder;
import com.pipeline.processing.data.dataconsumer.repository.UserDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDataConsumerService {

    @Autowired
    UserDataRepository userDataRepository;

    public List<UserData> getAllUsers()
    {
        return userDataRepository.findAll();
    }

    @StreamListener(MessageInputBinder.INPUT)
    public void processUserDataMessage(UserData userData)
    {
        userDataRepository.insert(userData);
    }
}
