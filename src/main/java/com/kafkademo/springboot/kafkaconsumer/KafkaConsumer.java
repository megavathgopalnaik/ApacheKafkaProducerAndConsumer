package com.kafkademo.springboot.kafkaconsumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {
    
	private static final Logger logger = LoggerFactory.getLogger(KafkaConsumer.class);
	
	@KafkaListener(topics = "gopal",groupId = "myGroup")
	public  void Consume(String message) {
		logger.info(String.format("received Message ->%s", message));
		
	}
}
