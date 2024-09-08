package com.nouroeddinne.gson;

import java.util.List;

public class Payment {


    String name;
    Double amount;

    public Payment() {
    }

    public Payment(String name, Double amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }


}
