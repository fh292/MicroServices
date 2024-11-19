package com.example.account.bo;

import java.util.List;

public class AccountResponse {
    private List<Stock> stocks;
    private String status;
    public AccountResponse() {
    }

    public AccountResponse(List<Stock> stocks, String status) {
        this.stocks = stocks;
        this.status = status;
    }

    public List<Stock> getStocks() {
        return stocks;
    }

    public void setStocks(List<Stock> stocks) {
        this.stocks = stocks;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}
