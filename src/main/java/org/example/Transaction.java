package org.example;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Transaction {
    private LocalDateTime date;
    private double amount;
    private String transactionType;
    private String description;
    public Transaction( double amount,String transactionType, String description) {
        this.date = LocalDateTime.now();
        this.amount = amount;
        this.transactionType = transactionType;
        this.description = description;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    @Override
    public String toString() {
        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        String formattedDate = date.format(myFormat);
        return "Date: " + formattedDate + ", Jumlah: " + amount + ", Jenis: " + transactionType + ", Deskripsi: " + description;
    }
}
