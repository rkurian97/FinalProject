package com.CIS3368.FinalProject.Models;
import com.CIS3368.FinalProject.Models.Employee;
import org.springframework.data.repository.CrudRepository;


public interface EmployeeRepo extends CrudRepository<Employee, String> {
}