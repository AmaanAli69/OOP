package Inventory_Management;

import java.util.Scanner;

public class FreshGoods extends Groceries{
    private String origin;

    public FreshGoods(String name, double price, int stock_quantity, int taxation_specifics, String expiration_date, String nutritional_values, String origin) {
        super(name, price, stock_quantity, taxation_specifics, expiration_date, nutritional_values);
        this.origin = origin;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public void update(Products p) {
        super.update(p);
    }

    @Override
    public int menu() {
        System.out.println("1. Name \n2. Price\n3. Stock Quantity\n4. Taxation Specifics\n5.Expiration Date\n6. Nutritional Values\n7. Origin");
        System.out.println("WHAT TO CHANGE : \n");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    @Override
    public void updating(int choice, Groceries product) {
        super.updating(choice, product);
        if (choice == 7)
        {
              FreshGoods goods = (FreshGoods) product;
              goods.setOrigin(updateOrigin());
        }
    }
    public String updateOrigin()
    {
        System.out.println("Enter new Origin");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nOrigin : " + origin
                ;
    }
    public String view() {
        return super.view() + String.format("Origin : %s\n\n",origin);
    }
}
