package com.niveus.springdemo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.niveus.springdemo.model.Transaction;


@Repository
public interface TransactionRepository extends CrudRepository<Transaction, Long>{

}