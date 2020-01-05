package io.thebongcoder.springboot.app.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
@Getter
public class PortfolioPositionDto {

    private final String firstName;
    private final String lastName;
    private final List<PositionDto> positions;
    private final Map<String, String> currencies;
}
