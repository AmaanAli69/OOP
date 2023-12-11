package Inventory_Management;

import java.util.Scanner;

public class Groceries extends Products{
    String expiration_date;
    String nutritional_values;

    public Groceries(String name, double price, int stock_quantity, int taxation_specifics, String expiration_date, String nutritional_values) {
        super(name, price, stock_quantity, taxation_specifics);
        this.expiration_date = expiration_date;
        this.nutritional_values = nutritional_values;

    }

    public String getExpiration_date() {
        return expiration_date;
    }

    public void setExpiration_date(String expiration_date) {
        this.expiration_date = expiration_date;
    }

    public String getNutritional_values() {
        return nutritional_values;
    }

    public void setNutritional_values(String nutritional_values) {
        this.nutritional_values = nutritional_values;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nexpiration_date: " + expiration_date + '\'' +
                ", \nnutritional_values: " + nutritional_values
                ;
    }
    public String view()
    {
        return super.view() + String.format("Expiration Date : %s\nNutritional Values : %s\n",expiration_date,nutritional_values);
    }


    public void update(Products p) {

            Groceries product = (Groceries) p;
            int choice = menu();
           updating(choice , product);

    }
    public int menu()
    {
        System.out.println("1. Name \n2. Price\n3. Stock Quantity\n4. Taxation Specifics\n5.Expiration Date\n6. Nutritional Values");
        System.out.println("WHAT TO CHANGE : \n");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    public void updating(int choice ,Groceries product)
    {
        if (choice == 1)
        {
            product.setName(updateName());
        }
        else if (choice == 2)
        {
            product.setPrice(updatePrice());
        }
        else if (choice == 3)
        {
            product.setStock_quantity(updateStock());
        }
        else if (choice == 4)
        {
            product.setTaxation_specifics(updateTaxation());
        }
        else if (choice == 5)
        {
            product.setExpiration_date(updateExpiry());
        }
        else if (choice == 6)
        {
            product.setNutritional_values(updateNutrition());
        }
    }
    public String updateExpiry()
    {
        System.out.println("Enter new Expiration Date : ");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    public String updateNutrition()
    {
        System.out.println("Enter new Nutritional Values : ");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

}
