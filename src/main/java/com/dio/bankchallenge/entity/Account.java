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
    protected Client client;

    public Account (Client client) {
        this.bankBranch = DEFAULT_BANK_BRANCH;
        this.account = SEQUENTIAL++;
        this.client = client;
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
        System.out.println("===== Saldo =====" +
                "\nAgência: " + this.bankBranch +
                "\nConta: " + this.account +
                "\nTipo de Conta: " + this.type +
                "\nTitular: " + this.getClient().getName() +
                "\nSaldo: R$" + this.getBalance());
    }

    @Override
    public void printTransferData(double amount, Account accountToReceive) {
        System.out.println("===== Comprovante de Transferência =====" +
                "\nAgência de Origem: " + this.bankBranch +
                "\nConta: " + this.account +
                "\nTipo de Conta: " + this.type +
                "\nTitular: " + this.getClient().getName() +
                "\n====================================" +
                "\nAgência de Destino: " + accountToReceive.getBankBranch() +
                "\nTipo de Conta: " + accountToReceive.getType() +
                "\nConta de Destino: " + accountToReceive.getAccount() +
                "\nTitular: " + accountToReceive.getClient().getName() +
                "\n====================================" +
                "\nValor transferido: R$" + amount);
    }

    @Override
    public String toString() {
        return "Agência: " + this.bankBranch + " / Conta: " + this.account;
    }

}
