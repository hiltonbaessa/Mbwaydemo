package com.example.demo.domain.user;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity(name = "users")
@Table (name = "users")
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;

    private  String firsName;

    private  String lastName;

    @Column (unique = true)
    private String document;

    @Column (unique = true)
    private String email;

    private String password;
    private BigDecimal balance;
    private UserType userType;
}
