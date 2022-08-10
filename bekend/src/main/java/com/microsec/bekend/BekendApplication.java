package com.microsec.bekend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BekendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BekendApplication.class, args);
	}

@Bean
  public CommandLineRunner demo(CustomerRepository repository) {
    return (args) -> {
      // save a few customers
      // repository.save(new Customer("Jack", "Bauer"));
      // repository.save(new Customer("Chloe", "O'Brian"));
      // repository.save(new Customer("Kim", "Bauer"));
      // repository.save(new Customer("David", "Palmer"));
      // repository.save(new Customer("Michelle", "Dessler"));
			};
  }
}
