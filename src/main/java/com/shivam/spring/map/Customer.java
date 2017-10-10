package com.shivam.spring.map;

import java.util.Map;
import java.util.Properties;

public class Customer {

    private int id;
    private Map<Integer,String> products;
    private Properties countriesAndLangs;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Map<Integer, String> getProducts() {
        return products;
    }

    public void setProducts(Map<Integer, String> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", products=" + products +
                '}';
    }

    public void setCountriesAndLangs(Properties countriesAndLangs) {
        this.countriesAndLangs = countriesAndLangs;
    }

    public Properties getCountriesAndLangs() {
        return countriesAndLangs;
    }
}

