package com.dio.bankchallenge.entity;

import com.dio.bankchallenge.enums.AccountType;

public class CheckingAccount extends Account {

    public CheckingAccount(AccountType type) {
        super();
        this.type = type;
    }

}
