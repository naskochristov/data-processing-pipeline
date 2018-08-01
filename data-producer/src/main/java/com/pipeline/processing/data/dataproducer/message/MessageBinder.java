package com.pipeline.processing.data.dataproducer.message;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface MessageBinder {

    String OUTPUT = "user-data-output";

    @Output(MessageBinder.OUTPUT)
    MessageChannel userDataOutput();
}
