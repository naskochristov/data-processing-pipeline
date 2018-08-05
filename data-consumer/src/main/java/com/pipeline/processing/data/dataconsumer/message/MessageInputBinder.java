package com.pipeline.processing.data.dataconsumer.message;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.MessageChannel;

public interface MessageInputBinder {

    String INPUT = "user-data-input";
    @Input(MessageInputBinder.INPUT)
    MessageChannel userDataInput();
}
