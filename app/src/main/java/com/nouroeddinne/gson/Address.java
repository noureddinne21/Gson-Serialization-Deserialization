package com.nouroeddinne.gson;

public class Address {
    String country, street, city;

    public Address() {
    }

    public Address(String country, String street, String city) {
        this.country = country;
        this.street = street;
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

