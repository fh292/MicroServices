package com.example.account.bo;

public class Stock {

    private long id;
    private long remainingQuantity;

    public Stock() {
    }

    public Stock(long id, long remainingQuantity) {
        this.id = id;
        this.remainingQuantity = remainingQuantity;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getRemainingQuantity() {
        return remainingQuantity;
    }

    public void setRemainingQuantity(long remainingQuantity) {
        this.remainingQuantity = remainingQuantity;
    }
}
