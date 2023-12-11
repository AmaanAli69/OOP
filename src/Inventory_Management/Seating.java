package Inventory_Management;

import java.util.Scanner;

public class Seating extends Furniture{
    private int loadCapacity;

    public Seating(String name, double price, int stock_quantity, int taxation_specifics, String material, String dimensions, int loadCapacity) {
        super(name, price, stock_quantity, taxation_specifics, material, dimensions);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void update(Products p) {
        super.update(p);
    }
    public int menu()
    {
        System.out.println("1. Name \n2. Price\n3. Stock Quantity\n4. Taxation Specifics\n5. Material\n6. Dimensions\n7. Load Capacity");
        System.out.println("WHAT TO CHANGE : \n");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    public void updating(int choice , Furniture product)
    {
        super.updating(choice , product);
        if (choice == 7)
        {
            Seating seat = (Seating) product;
            seat.setLoadCapacity(updateLoad());
        }
    }
    public int updateLoad()
    {
        System.out.println("Enter new Load Capacity : ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }


    @Override
    public String toString() {
        return super.toString() +
                "\nLoad Capacity : " + loadCapacity
                ;
    }
    public String view()
    {
        return super.view() + String.format("Load Capacity : %d\n\n",loadCapacity);
    }

}
