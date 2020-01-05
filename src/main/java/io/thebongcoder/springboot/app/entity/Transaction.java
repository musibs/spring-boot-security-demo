package io.thebongcoder.springboot.app.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.DBRef;

import javax.persistence.Id;
import java.math.BigDecimal;

@Data
public class Transaction {

    @Id
    private String id;
    @DBRef
    private final Currency currency;

    private final TransactionType transactionType;
    private final BigDecimal quantity;
    private final BigDecimal price;
    private final long timestamp;

    public Transaction(Currency currency, TransactionType transactionType, BigDecimal quantity, BigDecimal price, long timestamp){
        this.currency = currency;
        this.transactionType = transactionType;
        this.quantity = quantity;
        this.price = price;
        this.timestamp = timestamp;
        this.id = new ObjectId().toHexString();
    }
}
