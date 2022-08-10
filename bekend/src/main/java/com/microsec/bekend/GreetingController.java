package com.microsec.bekend;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;

@RestController
public class GreetingController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

  @Autowired
	private CustomerRepository repository;

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		String ret = String.format(template, name);
		for (Customer customer : repository.findAll()) {
        ret = ret + customer.toString();
      }
		return new Greeting(counter.incrementAndGet(), ret);
	}

  @GetMapping("/ready")
	public String ready() {
		return "ok";
	}

  @GetMapping("/vip")
	public List<Customer> boss() {
		List<Customer> result = new ArrayList<Customer>();
		repository.findAll().forEach(result::add);
		return result;
	}
}