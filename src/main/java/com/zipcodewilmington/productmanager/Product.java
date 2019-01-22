package com.zipcodewilmington.productmanager;

/**
 * Created by leon on 1/10/18.
 */
public class Product {

    private double price;
    private int id;
    private int quantity;
    private String name;

    public  Product(double price, int id, int quantity, String name ) {

        this.price = price;
        this.id = id;
        this.quantity = quantity;
        this.name = name;

    }

    public double getPrice() {

        return price;
    }

    public void setPrice(double price) {

        this.price = price;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public int getQuantity() {

        return quantity;
    }

    public void setQuantity(int quantity) {

        this.quantity = quantity;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }




}