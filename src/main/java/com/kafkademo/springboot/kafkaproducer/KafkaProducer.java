package com.kafkademo.springboot.kafkaproducer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaProducer {
     
	private static final Logger logger=LoggerFactory.getLogger(KafkaProducer.class);
	@Autowired
	private KafkaTemplate<String, String>kafkaTemplate;
	
	public void sendMessage(String message) {
		logger.info(String.format("Message is sent->%s", message));
		
		kafkaTemplate.send("gopal", message); //gopal is topic name
		
	}
}
