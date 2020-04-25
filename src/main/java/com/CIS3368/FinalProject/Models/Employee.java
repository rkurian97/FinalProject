package com.CIS3368.FinalProject.Models;
import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name= "Employee")
public class Employee {

    @Id
    @Column(name= "ID")
    public String id;

    @Column(name= "firstName")
    public String firstName;

    @Column(name= "lastName")
    public String lastName;

    @Column(name= "employeeID")
    public int employeeID;

    public Employee() {
    }

    public Employee(String firstName, String lastName, String id, int employeeID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.employeeID = employeeID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }
}
