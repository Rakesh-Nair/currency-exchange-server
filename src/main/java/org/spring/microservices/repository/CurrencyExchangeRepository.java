package org.spring.microservices.repository;

import org.spring.microservices.currencyexchangeserver.bean.ExchangeValue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyExchangeRepository extends JpaRepository<ExchangeValue, Long> {

	ExchangeValue findByFromAndTo(String from, String to);
}
