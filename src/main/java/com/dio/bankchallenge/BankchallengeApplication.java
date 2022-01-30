package com.dio.bankchallenge;

import com.dio.bankchallenge.entity.*;
import com.dio.bankchallenge.enums.AccountType;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankchallengeApplication {

	public static void main(String[] args) {

		SpringApplication.run(BankchallengeApplication.class, args);

		Client client1 = new Client();
		Client client2 = new Client();
		Client client3 = new Client();
		client1.setName("Rebeca Palmeira");
		client2.setName("Sara Vieira");
		client3.setName("Marcos Almeida");

		Account salaryAccount = new SalaryAccount(client1);
		Account savingsAccount = new SavingsAccount(client2, AccountType.PERSONAL);
		Account checkingAccount = new CheckingAccount(client3, AccountType.BUSINESS);


		salaryAccount.deposit(58.5);
		salaryAccount.printBalance();
		salaryAccount.transfer(24.0, savingsAccount);

		savingsAccount.printBalance();
		savingsAccount.transfer(12.5, checkingAccount);

		checkingAccount.printBalance();
	}

}
