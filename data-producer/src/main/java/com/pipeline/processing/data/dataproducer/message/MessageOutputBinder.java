package com.pipeline.processing.data.dataproducer.message;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface MessageOutputBinder {

    String OUTPUT = "user-data-output";

    @Output(MessageOutputBinder.OUTPUT)
    MessageChannel userDataOutput();
}
