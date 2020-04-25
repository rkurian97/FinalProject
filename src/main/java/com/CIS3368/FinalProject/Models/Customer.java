package com.CIS3368.FinalProject.Models;
import java.util.UUID;
import javax.persistence.*;

@Entity
@Table(name= "Customer")
public class Customer {
    @Id
    @Column(name= "id")
    public String id;

    @Column(name = "firstName")
    public String firstName;

    @Column(name = "lastName")
    public String lastName;


    public Customer(String firstName, String lastName, String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public Customer() {
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
}
