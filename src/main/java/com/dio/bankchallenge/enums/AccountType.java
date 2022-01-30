package com.dio.bankchallenge.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AccountType {

    BUSINESS("Business"),
    PERSONAL("Personal");

    private final String description;

}
