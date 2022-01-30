package com.dio.bankchallenge.entity;


import com.dio.bankchallenge.enums.AccountType;

public class SalaryAccount extends Account {

    public SalaryAccount(){
        super();
        this.type = AccountType.PERSONAL;
    }

}
