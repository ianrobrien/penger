package com.ianrobrien.penger.database;

import com.ianrobrien.penger.database.entities.Transaction;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@RunWith(SpringRunner.class)
public class DatabaseTest {

  @Autowired
  private TransactionRepository transactionRepository;

  @Test
  public void findAllMustReturnAnything() {
    Transaction transaction = new Transaction("comments");
    transactionRepository.save(transaction);

    assertThat(transactionRepository.findById(1L).orElseThrow(RuntimeException::new).getId()).isEqualTo(1L);
    assertThat(transactionRepository.findById(1L).orElseThrow(RuntimeException::new).getComments()).isEqualTo("comments");
  }

}

