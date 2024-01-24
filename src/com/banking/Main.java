package com.banking;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Account account1 = new Account(1, 1000);
        Account account2 = new Account(2,2000);

        bank.addAccount(account1);
        bank.addAccount(account2);

        account1.deposit(2000);
        account2.deposit(1000);

        System.out.println("Account 1 Balance: $" + account1.getBalance());
        System.out.println("Account 2 Balance: $" + account2.getBalance());
    }
}
