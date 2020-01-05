package io.thebongcoder.springboot.app.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;

@RequiredArgsConstructor
@Getter
@EqualsAndHashCode
public class PositionDto {

    private final CurrencyDto currency;
    private final BigDecimal quantity;
    private final BigDecimal value;
}
