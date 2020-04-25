package com.CIS3368.FinalProject.Models;
import com.CIS3368.FinalProject.Models.Transaction;
import org.springframework.data.repository.CrudRepository;

public interface TransactionRepo extends CrudRepository<Transaction, String> {
}
