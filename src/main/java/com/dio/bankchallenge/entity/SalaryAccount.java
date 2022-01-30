package com.dio.bankchallenge.entity;


import com.dio.bankchallenge.enums.AccountType;

public class SalaryAccount extends Account {

    public SalaryAccount(Client clientName){
        super(clientName);
        this.type = AccountType.PERSONAL;
    }

}
