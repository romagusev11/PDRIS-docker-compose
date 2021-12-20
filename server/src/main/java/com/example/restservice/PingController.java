package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {

	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/ping")
	public Ping ping() {
		return new Ping(counter.incrementAndGet());
	}
}
