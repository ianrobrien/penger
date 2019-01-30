package com.ianrobrien.penger.database;

import com.ianrobrien.penger.database.entities.Transaction;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@DataJpaTest
@RunWith(SpringRunner.class)
public class DatabaseTest {

  @Autowired
  private TransactionRepository transactionRepository;

  @Test
  public void findAllMustReturnAnything() {
    Transaction transaction = new Transaction();
    transactionRepository.save(transaction);

    Optional<Transaction> result = transactionRepository.findById(1L);

    result.ifPresent(t -> System.out.println(t.getId()));
  }

}
