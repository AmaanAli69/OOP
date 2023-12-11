package Inventory_Management;

import java.util.Objects;
import java.util.Scanner;

public class Electronics extends Products{
    private int power_consumption;
    private int warranty;

    public Electronics(String name, double price, int stock_quantity, int taxation_specifics, int power_consumption, int warranty) {
        super(name, price, stock_quantity, taxation_specifics);
        this.power_consumption = power_consumption;
        this.warranty = warranty;
    }

    public int getPower_consumption() {
        return power_consumption;
    }

    public void setPower_consumption(int power_consumption) {
        this.power_consumption = power_consumption;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nPower Consumption: " + power_consumption +
                ", \nWarranty: " + warranty
                ;
    }
//    public void update(Electronics product)
//    {
//
//        System.out.println("1. Name \n2. Price\n3. Stock Quantity\n4. Power Consumption ");
//        System.out.println("WHAT TO CHANGE : \n");
//        Scanner sc = new Scanner(System.in);
//        int choice = sc.nextInt();
//        if (choice == 1)
//        {
//            product.setName(updateName());
//        }
//        else if (choice == 2)
//        {
//            product.setPrice(updatePrice());
//        }
//        else if (choice == 3)
//        {
//            product.setStock_quantity(updateStock());
//        }
//        else if (choice == 4)
//        {
//            product.setPower_consumption(updateConsumption());
//        }
//    }

    @Override
    public void update(Products p) {

        Electronics product = (Electronics) p ;
        int choice = menu();
        updating(choice , product);
    }
    public int menu()
    {
        System.out.println("1. Name \n2. Price\n3. Stock Quantity\n4. Taxation Specifics\n5. Power Consumption  \n6. Warranty ");
        System.out.println("WHAT TO CHANGE : \n");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    public void updating(int choice , Electronics product )
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
            product.setPower_consumption(updateConsumption());
        }

        else if (choice == 6)
        {
            product.setWarranty(updateWarranty());
        }
    }

    public int updateConsumption()
    {
        System.out.println("Enter new Power Consumption : ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    public int updateWarranty()
    {
        System.out.println("Enter new Warranty : ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    public String view()
    {
        return super.view() + String.format("Power consumption : %d\nWarranty : %d\n",power_consumption,warranty);
    }
}
