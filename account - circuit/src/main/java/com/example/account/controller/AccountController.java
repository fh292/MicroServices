package com.example.account.controller;

import com.example.account.bo.AccountResponse;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
public class AccountController {

    private final RestTemplate restTemplate;
    private static final String STOCK_API = "http://localhost:8080/api/account";

    public AccountController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    @GetMapping("/account")
    @CircuitBreaker(name = "orderMS", fallbackMethod = "fallbackMethod")
    public AccountResponse getStocks(){
        ResponseEntity<AccountResponse> response = restTemplate.getForEntity(STOCK_API, AccountResponse.class);
        AccountResponse accountResponse = response.getBody();
        System.out.println("AccountResponse: " + accountResponse);
        return accountResponse;
    }

    public AccountResponse fallbackMethod(Throwable throwable) {
        AccountResponse accountStatus = new AccountResponse();
        accountStatus.setStatus("Called Fallback Method");
        return accountStatus;
    }



}
