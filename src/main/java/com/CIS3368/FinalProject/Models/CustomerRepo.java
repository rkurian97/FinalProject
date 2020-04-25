package com.CIS3368.FinalProject.Models;
import com.CIS3368.FinalProject.Models.Customer;
import org.springframework.data.repository.CrudRepository;


public interface CustomerRepo extends CrudRepository<Customer, String> {
}
