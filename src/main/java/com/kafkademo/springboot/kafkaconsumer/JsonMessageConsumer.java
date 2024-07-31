package com.kafkademo.springboot.kafkaconsumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.kafkademo.springboot.entity.User;

@Component
public class JsonMessageConsumer {

	
	   
		private static final Logger logger = LoggerFactory.getLogger(JsonMessageConsumer.class);
		
		@KafkaListener(topics = "gopal",groupId = "myGroup")
		public  void Consume(User user) {
			logger.info(String.format("received Message ->%s", user.toString()));
			
		}
}
