package io.swagger.repository;

import org.h2.mvstore.tx.Transaction;
import org.springframework.data.repository.CrudRepository;

public interface TransactionsRepository extends CrudRepository<Transaction, Long> {
    //sth
}
