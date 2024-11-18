package com.example.account.bo;

import java.util.List;

public class AccountResponse {
    private List<Stock> stocks;

    public AccountResponse() {
    }

    public AccountResponse(List<Stock> stocks) {
        this.stocks = stocks;
    }

    public List<Stock> getStocks() {
        return stocks;
    }

    public void setStocks(List<Stock> stocks) {
        this.stocks = stocks;
    }
}
