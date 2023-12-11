package Inventory_Management;

import java.util.Scanner;

public class Table  extends Furniture{

    String shape;
    public Table(String name, double price, int stock_quantity, int taxation_specifics, String material, String dimensions,String shape) {
        super(name, price, stock_quantity, taxation_specifics, material, dimensions);
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }
    @Override
    public void update(Products p) {
        super.update(p);
    }
    public int menu()
    {
        System.out.println("1. Name \n2. Price\n3. Stock Quantity\n4. Taxation Specifics\n5. Material\n6. Dimensions\n7. Shape");
        System.out.println("WHAT TO CHANGE : \n");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    public void updating(int choice , Furniture product)
    {
        super.updating(choice , product);
        if (choice == 7)
        {
            Table seat = (Table) product;
            seat.setShape(updateShape());
        }
    }
    public String updateShape()
    {
        System.out.println("Enter new Shape");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nShape : " + shape
                ;
    }
    public String view() {
        return super.view() + String.format("Shape : %s\n\n",shape);
    }
}
