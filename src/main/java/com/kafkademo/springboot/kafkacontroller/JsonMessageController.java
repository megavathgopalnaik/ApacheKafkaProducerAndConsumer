package com.kafkademo.springboot.kafkacontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kafkademo.springboot.entity.User;
import com.kafkademo.springboot.kafkaproducer.JsonMessageProducer;

@RestController
@RequestMapping("/api/v1/kafka")
public class JsonMessageController {

	
	@Autowired
	private JsonMessageProducer kafkaProducer;
	
	@PostMapping("publish")
	public ResponseEntity<String> jsonPublisher(@RequestBody User user){
		
		kafkaProducer.sendMessage(user);
		
		return ResponseEntity.ok("Json Message  Has sent");
	}
}
