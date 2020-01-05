package io.thebongcoder.springboot.app.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@RequiredArgsConstructor
@Getter
@EqualsAndHashCode(exclude = {"id", "currencyName"})
@Document
@ToString
public class Currency {

    @Id
    private String id;
    @Indexed(unique = true)
    private final String currencyName;
    private final String currencySymbol;
}
