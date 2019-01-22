package com.zipcodewilmington.productmanager;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

    private List<Product> productList = new ArrayList<Product>();


    public Inventory(List<Product> productList) {

        this.productList = productList;

    }

    public List<Product> getProductList() {

        return this.productList;

    }

    public void add(Product product) {

        this.productList.add(product);

    }

    public boolean contains(Product product) {

        return this.productList.contains(product);
    }

    public void remove(Product product) {

        this.productList.remove(product);

    }

    public int size() {

        return this.productList.size();
    }

    public double getTotalValue() {

        double sum = 0;

        for (Product p : productList) {

            sum += p.getQuantity() * p.getPrice();
        }

        return sum;

    }
}