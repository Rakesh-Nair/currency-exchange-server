package org.spring.microservices.currencyexchangeserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("org.spring.microservices.repository")
@ComponentScan(basePackages = "org.spring.microservices")
public class CurrencyExchangeServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyExchangeServerApplication.class, args);
	}

}
