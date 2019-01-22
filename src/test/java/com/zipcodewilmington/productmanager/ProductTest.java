package com.zipcodewilmington.productmanager;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class ProductTest {

    @Test
    public void constructorTest() {

        //Given
        double price = 79.99;

        int id = 2;

        int quantity = 20;

        String name = "Hoodie";

        //When
        Product product = new Product(price, id, quantity,name);


        //Then
        Assert.assertEquals(price,product.getPrice());
        Assert.assertEquals(id, product.getId());
        Assert.assertEquals(quantity,product.getQuantity());
    }
    @Test
    public void setPriceTest() {

        //Given
        Product product = new Product(79.99, 2, 20, "Hoodie");

        //When
        product.setPrice(20.00);


        //Then
        Assert.assertEquals(20.00, product.getPrice(), 0);

    }
    @Test
    public void setIdTest() {

        //Given
        Product product = new Product(79.99, 2, 20, "Hoodie");

        //When
        product.setId(2);

        //Then
        Assert.assertEquals(2, product.getId());

    }
    @Test
    public void setQuantityTest() {

        //Given
        Product product = new Product(79.99, 2, 20, "Hoodie");

        //When
        product.setQuantity(20);


        //Then
        Assert.assertEquals(20, product.getQuantity());


    }
    @Test
    public void setNameTest() {

        //Given
        Product product = new Product(79.99, 2, 20, "Hoodie");

        //When
        product.setName("Hoodie");


        //Then
        Assert.assertEquals("Hoodie", product.getName());


    }
    @Test
    public void getQuantityTest() {

        //Given
        Product product = new Product(79.99, 2, 20, "Hoodie");


        //When
        product.getQuantity();



        //Then
        Assert.assertEquals(20, product.getQuantity());

    }
    @Test
    public void getPriceTest() {

        //Given
        Product product = new Product(79.99, 2, 20, "Hoodie");

        //When
        product.getPrice();


        //Then
        Assert.assertEquals(79.99, product.getPrice(), 0);

    }
    @Test
    public void getIdTest() {

        //Given
        Product product = new Product(79.99, 2, 20, "Hoodie");

        //When
        product.getId();

        //Then
        Assert.assertEquals(2, product.getId());

    }
    @Test
    public void getNameTest() {

        //Given
        Product product = new Product(79.99, 2, 20, "Hoodie");

        //When
        product.getName();


        //Then
        Assert.assertEquals("Hoodie", product.getName());


    }
}
