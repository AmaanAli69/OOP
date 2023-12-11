package Inventory_Management;

import java.util.Scanner;

public class Laptop extends Electronics{
    private String processor_type;
    private int RAM_size;
    private String screen_dimensions;

    public Laptop(String name, double price, int stock_quantity, int taxation_specifics, int power_consumption, int warranty, String processor_type, int RAM_size, String screen_dimensions) {
        super(name, price, stock_quantity, taxation_specifics, power_consumption, warranty);
        this.processor_type = processor_type;
        this.RAM_size = RAM_size;
        this.screen_dimensions = screen_dimensions;
    }

    public String getProcessor_type() {
        return processor_type;
    }

    public void setProcessor_type(String processor_type) {
        this.processor_type = processor_type;
    }

    public int getRAM_size() {
        return RAM_size;
    }

    public void setRAM_size(int RAM_size) {
        this.RAM_size = RAM_size;
    }

    public String getScreen_dimensions() {
        return screen_dimensions;
    }

    public void setScreen_dimensions(String screen_dimensions) {
        this.screen_dimensions = screen_dimensions;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nprocessor_type: " + processor_type +
                ", \nRAM_size: " + RAM_size +
                ", \nscreen_dimensions: " + screen_dimensions
                ;
    }

    @Override
    public String view() {
        return super.view() + String.format("Processor Type : %s\nRam size : %d\nScreen dimensions : %s\n\n",processor_type,RAM_size,screen_dimensions);
    }

    @Override
    public void update(Products p) {
      super.update(p);
    }
    public int menu()
    {
        System.out.println("1. Name \n2. Price\n3. Stock Quantity\n4. Taxation Specifics\n5. Power Consumption  \n6. Warranty\n7. Processor Type\n8.Ram Size\n9. Screen Dimensions ");
        System.out.println("WHAT TO CHANGE : \n");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();

    }
    public void updating(int choice , Electronics product)
    {

        super.updating(choice,product);
        if (choice == 7)
        {
            Laptop p = (Laptop) product;
            p.setProcessor_type(updateProcessor());
        }
        else if (choice == 8)
        {
            Laptop p = (Laptop) product;
            p.setRAM_size(updateRam());
        }
        else if (choice == 9)
        {
            Laptop p = (Laptop) product;
            p.setScreen_dimensions(updateScreen());
        }


    }

    public String updateProcessor()
    {
        System.out.println("Enter new Processor Type");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    public int updateRam()
    {
        System.out.println("Enter new Ram Size");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    public String updateScreen()
    {
        System.out.println("Enter new Screen Dimensions");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
