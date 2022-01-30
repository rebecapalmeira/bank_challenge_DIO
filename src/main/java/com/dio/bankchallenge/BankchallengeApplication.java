package com.dio.bankchallenge;

import com.dio.bankchallenge.entity.Account;
import com.dio.bankchallenge.entity.CheckingAccount;
import com.dio.bankchallenge.entity.SalaryAccount;
import com.dio.bankchallenge.entity.SavingsAccount;
import com.dio.bankchallenge.enums.AccountType;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankchallengeApplication {

	public static void main(String[] args) {

		SpringApplication.run(BankchallengeApplication.class, args);

		Account salaryAccount = new SalaryAccount();
		Account savingsAccount = new SavingsAccount(AccountType.PERSONAL);
		Account checkingAccount = new CheckingAccount(AccountType.BUSINESS);
		salaryAccount.deposit(58.5);
		salaryAccount.printBalance();
		salaryAccount.transfer(24.0, savingsAccount);

		savingsAccount.printBalance();
		savingsAccount.transfer(12.5, checkingAccount);

		checkingAccount.printBalance();
	}

}
