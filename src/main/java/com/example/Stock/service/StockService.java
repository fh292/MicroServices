package com.example.Stock.service;

import com.example.Stock.bo.CreateStockRequest;
import com.example.Stock.bo.UpdateStockResponse;
import com.example.Stock.entity.StockEntity;

import java.util.List;

public interface StockService  {
    UpdateStockResponse updateStock(CreateStockRequest request);

    void addItems(CreateStockRequest stock);

    List<StockEntity> getStocks();
}
