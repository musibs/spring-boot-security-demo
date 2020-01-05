package io.thebongcoder.springboot.app.entity;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Document
@Getter
@RequiredArgsConstructor
public class Portfolio {

    @Id
    private String id;
    @NonNull
    private final String userName;
    private final List<Transaction> transactions;


    public void addTransaction(Transaction transaction){
        this.transactions.add(transaction);
    }

    public List<Transaction> getAllTransactions(){
        return Collections.unmodifiableList(transactions);
    }

    public List<Transaction> getTransactionForCurreny(String symbol){
        return transactions.stream()
                .filter(transaction -> transaction.getCurrency().getCurrencySymbol().equals(symbol)).collect(Collectors.toList());
    }

    public void deleteTransaction(Transaction transaction){
        transactions.remove(transaction);
    }

    public Optional<Transaction> getTransactionById(String id){
         List<Transaction> filterTransaction = transactions.stream().filter(transaction -> transaction.getId().equals(id)).collect(Collectors.toList());
         if(filterTransaction.isEmpty()){
             return Optional.empty();
         }
         return Optional.of(filterTransaction.get(0));
    }
}
