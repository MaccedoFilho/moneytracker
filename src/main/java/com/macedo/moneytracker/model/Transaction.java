package com.macedo.moneytracker.model;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "transactions") // nome da tabela no banco
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private BigDecimal value;
    private String type; // receita ou despesa
    private LocalDateTime date;

    @ManyToOne
    @JoinColumn(name = "user_id") // chave para users
    private User user;
}
