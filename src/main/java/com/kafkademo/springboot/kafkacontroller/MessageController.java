package com.kafkademo.springboot.kafkacontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kafkademo.springboot.kafkaproducer.KafkaProducer;

@RestController
@RequestMapping("/api/v1/kafka")
public class MessageController {
	
	@Autowired
	private KafkaProducer kafkaProducer;
	
	@GetMapping("publish")
	public ResponseEntity<String> messagePublicher(@RequestParam("message")String message) {
		kafkaProducer.sendMessage(message);
		
		return ResponseEntity.ok("Message has been sent");
	}
   
}
