package io.thebongcoder.springboot.app.repository;

import io.thebongcoder.springboot.app.entity.Currency;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CurrencyRepository extends MongoRepository<Currency, String> {
    Currency findByCurrencySymbol(String currencySymbol);
}
