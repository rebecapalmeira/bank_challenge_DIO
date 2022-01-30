package com.dio.bankchallenge.entity;

import com.dio.bankchallenge.enums.AccountType;
import lombok.Getter;

@Getter
public class Account implements IAccount{

    private static int DEFAULT_BANK_BRANCH = 1;
    private static int SEQUENTIAL = 1;

    protected int bankBranch;
    protected int account;
    protected double balance;
    protected AccountType type;
    protected Client clientName;

    public Account () {
        this.bankBranch = DEFAULT_BANK_BRANCH;
        this.account = SEQUENTIAL++;
    }


    @Override
    public void withdraw(double amount) {
        this.balance -= amount;
    }

    @Override
    public void deposit(double amount) {
        this.balance += amount;
    }

    @Override
    public void transfer(double amount, Account accountToReceive) {
        this.withdraw(amount);
        accountToReceive.deposit(amount);
        printTransferData(amount, accountToReceive);
    }

    @Override
    public void printBalance() {
        System.out.println("===== Saldo =====\nAgência: " + this.bankBranch +
                "\nTipo de Conta: " + this.type +
                "\nConta: " + this.account +
                "\nSaldo: R$" + this.getBalance());
    }

    @Override
    public void printTransferData(double amount, Account accountToReceive) {
        System.out.println("===== Comprovante de Transferência =====\nAgência de Origem: " + this.bankBranch +
                "\nTipo de Conta: " + this.type +
                "\nConta: " + this.account +
                "\n====================================\nAgência de Destino: " + accountToReceive.getBankBranch() +
                "\nTipo de Conta: " + accountToReceive.getType() +
                "\nConta de Destino: " + accountToReceive.getAccount() +
                "\n====================================\nValor transferido: R$" + amount);
    }

    @Override
    public String toString() {
        return "Agência: " + this.bankBranch + " / Conta: " + this.account;
    }

}
