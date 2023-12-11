package Inventory_Management;

import java.sql.SQLOutput;
import java.util.Objects;
import java.util.Scanner;

public class Products {
    private String name;
    private double price;
    private int stock_quantity;
    private int taxation_specifics;
    final private int productID;
    static int counter = 1 ;



    public Products(String name, double price, int stock_quantity, int taxation_specifics) {
        this.name = name;
        this.price = price;
        this.stock_quantity = stock_quantity;
        this.taxation_specifics = taxation_specifics;
        this.productID = counter++;

    }
    public Products()
    {
        this.name = "null";
        this.price = 0;
        this.stock_quantity = 0;
        this.taxation_specifics = 0;
        this.productID = counter++;

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

    public int getStock_quantity() {
        return stock_quantity;
    }

    public void setStock_quantity(int stock_quantity) {
        this.stock_quantity = stock_quantity;
    }

    public int getTaxation_specifics() {
        return taxation_specifics;
    }

    public void setTaxation_specifics(int taxation_specifics) {
        this.taxation_specifics = taxation_specifics;
    }

    public int getProductID() {
        return productID;
    }

    public void update(Products product)
    {

    }

    public String updateName()
    {
        System.out.println("Enter new Name");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    public double updatePrice()
    {
        System.out.println("Enter new Price");
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }
    public int updateStock()
    {
        System.out.println("Enter new Stock Quantity");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    public int updateTaxation()
    {
        System.out.println("Enter new Taxation Specifics");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();

    }


    @Override
    public String toString() {
        return
                "\nName: " + name +
                        ", \nPrice: " + price +
                        ", \nStock_quantity: " + stock_quantity +
                        ", \nTaxation Specifics: " + taxation_specifics +
                        ", \nProductID: " + productID
                ;
    }
    public String view()
    {
        return String.format("Name : %s\nPrice : %f\nStock Quantity : %d\nTax : %d\nProduct ID : %d\n",name,price,stock_quantity,taxation_specifics,productID);
    }
}
