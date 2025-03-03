package com.macedo.moneytracker.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor // construtor vazio para JPA
@Entity
@Table(name = "users") //
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // gera um ID automático
    private Long id;

    private String nome;
    private String email;
}
