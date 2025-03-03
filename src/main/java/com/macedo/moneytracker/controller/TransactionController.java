package com.macedo.moneytracker.controller;

import com.macedo.moneytracker.model.Transaction;
import com.macedo.moneytracker.service.TransactionService;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/transactions")  // define o caminho base para todas as requisições desse controller
public class TransactionController {

    private final TransactionService transactionService;

    // injeção de dependência do serviço
    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    // adicionar uma nova transação (receita ou despesa)
    @PostMapping
    public Transaction adicionarTransacao(@RequestBody Transaction transaction) {
        return transactionService.adicionarTransacao(transaction);
    }

    // listar todas as transações de um usuário específico
    @GetMapping("/{userId}")
    public List<Transaction> listarTransacoes(@PathVariable Long userId) {
        return transactionService.listarTransacoes(userId);
    }

    // calcular o saldo atual do usuário
    @GetMapping("/{userId}/saldo")
    public BigDecimal calcularSaldo(@PathVariable Long userId) {
        return transactionService.calcularSaldo(userId);
    }
}
