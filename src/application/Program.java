package application;

import java.util.Scanner;
import model.entities.Account;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = sc.nextInt();
        System.out.print("Holder: ");
        String holder = sc.next();
        System.out.print("Initial balance: ");
        double initialBalance = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        double withdrawLimit = sc.nextDouble();
        double balance = 0.0;
        // acc.deposit(10.0);
        Account account = new Account(number, holder, balance, withdrawLimit);
        account.deposit(initialBalance);

        System.out.print("Enter amount for withdraw: ");
        Double amount = sc.nextDouble();
        account.withdraw(amount);

        System.out.println("New balance: " + account.getBalance());

    }

}
