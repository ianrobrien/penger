package com.ianrobrien.penger.database;

import com.ianrobrien.penger.database.entities.Transaction;
import org.springframework.data.repository.CrudRepository;

public interface TransactionRepository extends CrudRepository<Transaction, Long> {

}
