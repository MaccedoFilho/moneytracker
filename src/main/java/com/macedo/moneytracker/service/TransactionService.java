package com.macedo.moneytracker.service;

import com.macedo.moneytracker.model.Transaction;
import com.macedo.moneytracker.repository.TransactionRepository;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;
import java.util.List;

@Service
public class TransactionService {

    private final TransactionRepository transactionRepository;

    public TransactionService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    public Transaction adicionarTransacao(Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    public List<Transaction> listarTransacoes(Long userId) {
        return transactionRepository.findByUserId(userId);
    }

    public BigDecimal calcularSaldo(Long userId) {
        List<Transaction> transacoes = transactionRepository.findByUserId(userId);

        BigDecimal saldo = BigDecimal.ZERO;
        for (Transaction transacao : transacoes) {
            if ("receita".equalsIgnoreCase(transacao.getType())) {
                saldo = saldo.add(transacao.getValue());
            } else if ("despesa".equalsIgnoreCase(transacao.getType())) {
                saldo = saldo.subtract(transacao.getValue());
            }
        }
        return saldo;
    }
}
