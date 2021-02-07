package org.spring.microservices.controller;

import org.spring.microservices.currencyexchangeserver.bean.ExchangeValue;
import org.spring.microservices.repository.CurrencyExchangeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {

	@Autowired
	private Environment environment;

	@Autowired
	private CurrencyExchangeRepository repository;

	public CurrencyExchangeController(Environment environment, CurrencyExchangeRepository repository) {
		super();
		this.environment = environment;
		this.repository = repository;
	}

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retrieveExchangeValue(@PathVariable String from, @PathVariable String to) {
		ExchangeValue exchangeValue = repository.findByFromAndTo(from, to);
		if (exchangeValue == null) {
			throw new RuntimeException("Currency Exchange not Found");
		}
		exchangeValue.setEnvironment(environment.getProperty("local.server.port"));
		return exchangeValue;
	}

}
