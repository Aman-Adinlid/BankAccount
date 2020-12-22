package org.example.model;

public class BankAccount {

    private String customerName;
    private int accountNumber;
    private String email;
    private double balance;
private String phoneNumber;

    public BankAccount(String customerName, int accountNumber, String email, double balance, String phoneNumber) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.email = email;
        this.balance = balance;
        this.phoneNumber = phoneNumber;
    }
    public String deposit (double amount){
        if (amount<=0){
            return "amount is not valid";
        }
       // balance = balance + amount;
        this.setBalance(this.getBalance() + amount);
        return "deposit operation is done";
    }
public String withdraw(double amount){
        if (amount<=0){
            return "amount is not valid";

        }
        if (amount> balance){
            return "balance is not valid";

        }
        this.setBalance(this.getBalance()- amount);
        return "withdraw operation is done";
}


    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String isPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

