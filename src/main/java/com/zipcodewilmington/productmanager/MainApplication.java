package com.zipcodewilmington.productmanager;

import javax.management.remote.rmi.RMIConnectionImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by leon on 1/10/18.
 */
public class MainApplication {

    public static void main(String[] args) {

        List<Product> productList = new ArrayList<Product>();

        Inventory inventory = new Inventory(productList);


        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Inventory Manager\n");

        System.out.println(new StringBuilder()
                .append("From here you can ")
                .append("[ view ]")
                .append(" [ add ]")
                .append("[ remove ]")
                .append("products.")
                .toString());

        String userInput = scanner.nextLine();
        if(userInput.equals("view")) {
            // display inventory
            String view = inventory.toString();
            System.out.println(view);
        }

        if(userInput.equals("add")) {
            //prompt user for product information
            System.out.println("What's the price?");
            Double price = Double.parseDouble(scanner.nextLine());
            //add product into inventory

        }
    }


}
