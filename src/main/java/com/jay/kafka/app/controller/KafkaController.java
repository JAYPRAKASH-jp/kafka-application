package com.jay.kafka.app.controller;

import org.springframework.web.bind.annotation.*;

import com.jay.kafka.app.kafka.clients.KafkaProducerService;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

	private final KafkaProducerService kafkaProducerService;

	public KafkaController(KafkaProducerService kafkaProducerService) {
		this.kafkaProducerService = kafkaProducerService;
	}

	@GetMapping("/send/{message}")
	public String sendMessage(@PathVariable String message) {
		kafkaProducerService.sendMessage(message);
		return "Message sent: " + message;
	}
}
