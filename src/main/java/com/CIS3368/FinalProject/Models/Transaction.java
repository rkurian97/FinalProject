package com.CIS3368.FinalProject.Models;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "Transaction")

public class Transaction {

    @Id
    @Column(name = "id")
    public String id;

    @Column(name = "CustomerID")
    public String custID;

    @Column(name = "ProductID")
    public String prodID;

    @Column(name = "EmployeeID")
    public String empID;

    @Column(name = "Date")
    public String date;

    @Column(name = "Receipt")
    public int receipt;

    public Transaction(){

    }

    public Transaction(String id, String custID, String prodID, String empID, String date, int receipt){
        this.id= id;
        this.custID = custID;
        this.prodID = prodID;
        this.empID = empID;
        this.date = date;
        this.receipt = receipt;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getCustID() {
        return custID;
    }
    public void setCustID(String custID) {
        this.custID = custID;
    }

    public String getProdID() {
        return prodID;
    }
    public void setProdID(String prodID) {
        this.prodID = prodID;
    }

    public String getEmpID() {
        return empID;
    }
    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }

    public int getReceipt() {
        return receipt;
    }
    public void setReceipt(int receipt) {
        this.receipt = receipt;
    }
}

