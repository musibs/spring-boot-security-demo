package io.thebongcoder.springboot.app.repository;

import io.thebongcoder.springboot.app.entity.Portfolio;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PortfolioRepository extends MongoRepository<Portfolio, String> {

    Portfolio findByUserName(String userName);
}
