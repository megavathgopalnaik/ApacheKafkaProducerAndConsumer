package com.kafkademo.springboot.kafkaproducer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

import com.kafkademo.springboot.entity.User;

@Component
public class JsonMessageProducer {

	
	private static final Logger logger=LoggerFactory.getLogger(JsonMessageProducer.class);
	@Autowired
	private KafkaTemplate<String, String>kafkaTemplate;
	
	public void sendMessage(User user) {
		logger.info(String.format("Message is sent->%s", user.toString()));
		Message<User>message=MessageBuilder
				             .withPayload(user)
				             .setHeader(KafkaHeaders.TOPIC, "gopal")
				             .build();
		
		kafkaTemplate.send(message);
}
}