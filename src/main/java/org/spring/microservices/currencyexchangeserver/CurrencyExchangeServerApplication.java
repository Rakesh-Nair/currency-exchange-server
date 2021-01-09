package org.spring.microservices.currencyexchangeserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "org.spring.microservices")
public class CurrencyExchangeServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyExchangeServerApplication.class, args);
	}

}
