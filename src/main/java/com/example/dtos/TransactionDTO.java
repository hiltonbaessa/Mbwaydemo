package com.example.dtos;

import java.math.BigDecimal;

public record TransactionDTO(BigDecimal value, Long senderId, Long receiverId) {
}
