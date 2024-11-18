package com.example.Stock.controller;

import com.example.Stock.bo.AccountResponse;
import com.example.Stock.bo.CreateStockRequest;
import com.example.Stock.bo.UpdateStockResponse;
import com.example.Stock.entity.StockEntity;
import com.example.Stock.repository.StockRepository;
import com.example.Stock.service.StockService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StockController {

    private final StockService stockService;
    private final StockRepository stockRepository;

    public StockController(StockService stockService, StockRepository stockRepository) {
        this.stockService = stockService;
        this.stockRepository = stockRepository;
    }

    @PostMapping("/addItems")
    public void addItems(@RequestBody CreateStockRequest stock) {
        stockService.addItems(stock);
    }

    @PostMapping("/updateStock")
    public UpdateStockResponse updateStock(@RequestBody CreateStockRequest request) {
        return stockService.updateStock(request);
    }

    @GetMapping("/account")
    public AccountResponse getAccountStocks(){
        List<StockEntity> stocks = stockService.getStocks();
        AccountResponse accountResponse = new AccountResponse();
        accountResponse.setStocks(stocks);
        return accountResponse;
    }


}