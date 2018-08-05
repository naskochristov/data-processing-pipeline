package com.pipeline.processing.data.dataproducer;

import com.pipeline.processing.data.dataproducer.message.MessageOutputBinder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding(MessageOutputBinder.class)
public class DataProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataProducerApplication.class, args);
	}
}
