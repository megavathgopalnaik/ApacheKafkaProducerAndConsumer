package com.kafkademo.springboot.createtopic;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopic {

	@Bean
	public NewTopic newTopic() {
		
		return TopicBuilder.name("gopal")
				//.partitions(10)//to split topic into partitions 10 or can use default by commenting
				.build();
				
	}
}
