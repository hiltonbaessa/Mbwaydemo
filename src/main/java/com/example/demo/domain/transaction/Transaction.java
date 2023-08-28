package com.example.demo.domain.transaction;

import com.example.demo.domain.user.User;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity(name = "/transactions")
@Table (name="transactions")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private BigDecimal amount;

    @ManyToOne
    @JoinColumn (name = "sender id")
    private User sender;

    @ManyToOne
    @JoinColumn (name = "receiver id")
    private  User receiver;

    private LocalDateTime timestamp;
}
