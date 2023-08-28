package com.example.services;

import com.example.demo.domain.transaction.Transaction;
import com.example.demo.domain.user.User;
import com.example.dtos.TransactionDTO;
import com.example.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;

@Service
public class TransactionService {

    @Autowired
    private UserService userService;

    @Autowired
    private TransactionRepository repository;

    @Autowired
    private RestTemplate restTemplate;

    public void createTransaction(TransactionDTO transaction) throws Exception {
        User sender = this.userService.findUserById(transaction.receiverId());
        User receiver = this.userService.findUserById(transaction.receiverId());

        userService.validateTransaction(sender,transaction.value());

        if (sender.getUserType() == )


    }

    public  boolean authorizeTransaction(User sender, BigDecimal value){

    }
}
