package org.example;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListTransaction listTransaction = new ListTransaction();
        boolean isRunning =true;
        while (isRunning){
            System.out.println("Simple Financial App");
            System.out.println("1. New Transaction");
            System.out.println("2. Transaction History");
            System.out.println("3. Show Balance");
            System.out.println("4. Exit");
            int menu = scanner.nextInt();
            switch (menu){
                case 1:
                    System.out.println("Input Transaction Type (Income / Expense)");
                    String typeTransaction = scanner.next();
                    System.out.println("Input Amount");
                    double amount = scanner.nextDouble();
                    System.out.println("Input Description");
                    String desc = scanner.next();
                    Transaction transaction = new Transaction( amount, typeTransaction, desc);
                    listTransaction.addTransaction(transaction);
                    System.out.println("Succesfull Add Transaction");
                    break;
                case 2:
                    listTransaction.showListTransaction();
                    break;
                case 3:
                    double balance = listTransaction.balanceCount();
                    System.out.println("Balance : "+ balance);
                    break;
                case 4:
                    isRunning = false;
                    System.out.println("Thank you for using this App");
                    break;
                default:
                    System.out.println("Invalid Option");
                    break;
            }
        }
    }
}