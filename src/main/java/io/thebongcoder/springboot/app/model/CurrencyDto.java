package io.thebongcoder.springboot.app.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@EqualsAndHashCode
@Getter
@ToString
public class CurrencyDto {

    private final String currencyName;
    private final String currencySymbol;

}
