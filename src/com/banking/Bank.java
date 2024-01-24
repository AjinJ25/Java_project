package com.banking;
import java.util.ArrayList;
import java.util.*;

public class Bank {
    private ArrayList<Account> accounts;

    public Bank(){
        this.accounts = new ArrayList<>();
    }
    public void addAccount(Account account){
        accounts.add(account);
    }
    public Account getAccount(int accountNumber){
        for(Account account : accounts){
            if (account.getAccountNumber() == accountNumber){
                return account;

            }
        }
        return null;
    }
}
