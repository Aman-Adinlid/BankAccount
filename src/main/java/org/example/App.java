package org.example;


import org.example.model.BankAccount;

public class App {
    public static void main( String[] args )
    {
        BankAccount MyAccount = new BankAccount("Aman",123400,"pinkpand@gmail.com",100,"126622992");
        System.out.println("customerName: "+ MyAccount.getCustomerName() +"balance: " + MyAccount.getBalance());
        System.out.println("call deposit method+ 300");
        System.out.println("customerName: "+ MyAccount.getCustomerName() +"balance: " + MyAccount.getBalance());
String result = MyAccount.deposit(0);
        System.out.println(result);

        MyAccount.deposit(300);
        System.out.println("---------------------------------------------");
        System.out.println("customerName: "+ MyAccount.getCustomerName() +"balance: " + MyAccount.getBalance());
        String result1 = MyAccount.deposit(200);
        System.out.println(result1);
        System.out.println("customerName: "+ MyAccount.getCustomerName() +"balance: " + MyAccount.getBalance());
        String result2 = MyAccount.deposit(100);
        System.out.println(result2);


    }
}
