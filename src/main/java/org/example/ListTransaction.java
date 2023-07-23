package org.example;

import java.util.ArrayList;

public class ListTransaction {
    private ArrayList<Transaction> transactionList;
    public ListTransaction(){
        transactionList = new ArrayList<>();
    }
    public void addTransaction(Transaction transaction){
        transactionList.add(transaction);
    }
    public void showListTransaction(){
        if (transactionList.isEmpty()){
            System.out.println("Empty transanction");
        }else {
            System.out.println("Transanction List :");
            for (int i =0;i<transactionList.size();i++){
                Transaction transaction = transactionList.get(i);
                System.out.println((i+1)+". "+transaction.toString());
            }
        }
    }
    public double balanceCount(){
        double balance=0;
        for (Transaction transaction:transactionList){
           if(transaction.getTransactionType().equals("Income")){
               balance += transaction.getAmount();
           }else {
               balance -= transaction.getAmount();
           }
        }
        return balance;
    }
}
