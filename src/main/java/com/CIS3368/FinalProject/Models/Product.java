package com.CIS3368.FinalProject.Models;
import java.util.UUID;
import javax.persistence.*;

@Entity
@Table(name= "Product")
public class Product {
    @Id
    @Column(name= "ID")
    public String id;

    @Column(name= "name")
    public String name;

    @Column(name= "price")
    public double price;

    @Column(name= "description")
    public String description;

    public Product() {
    }
    public Product(String id, String name, double price, String description) {
        this.id=id;
        this.name=name;
        this.price=price;
        this.description=description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
