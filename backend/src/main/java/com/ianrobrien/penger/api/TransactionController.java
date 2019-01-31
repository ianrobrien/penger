package com.ianrobrien.penger.api;

import com.ianrobrien.penger.database.TransactionRepository;
import com.ianrobrien.penger.database.entities.Transaction;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {

  private TransactionRepository transactionRepository;

  public TransactionController(TransactionRepository transactionRepository) {
    this.transactionRepository = transactionRepository;
  }

  @RequestMapping("/transactions")
  public Iterable<Transaction> getAllTransactions() {
    transactionRepository.save(new Transaction("my comment"));
    return transactionRepository.findAll();
  }

}
