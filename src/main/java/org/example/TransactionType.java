package org.example;

public enum TransactionType {
    EXPENSE("Expense"), INCOME("Income");
    private final String value;
    TransactionType(String value){
        this.value=value;
    }
    public String getValue(){
        return value;
    }
    public String toString(){
        return value;
    }


}
