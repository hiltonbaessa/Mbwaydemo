package com.example.services;

import com.example.demo.domain.user.User;
import com.example.demo.domain.user.UserType;
import com.example.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public void validateTransaction (User sender, BigDecimal amount) throws Exception {
        if (sender.getUserType()== UserType.MERCHANT) {
            throw new Exception("Usuario do tipo logistica nao está autorizado a fazer transferencia");
        }
        if (sender.getBalance().compareTo(amount) < 0) {
            throw new Exception("Saldo insuficiente");
        }
    }

    public User findUserById(Long id) throws Exception {
        return this.repository.findUserById(id).orElseThrow(()-> new  Exception("Usuario nao encontrado"));
    }

    public void saveUser(User user){
        this.repository.save(user);
    }
}
