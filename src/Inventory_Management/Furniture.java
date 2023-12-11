package Inventory_Management;

import java.util.Scanner;

public class Furniture extends Products {
    private String material;
    private String dimensions;

    public Furniture(String name, double price, int stock_quantity, int taxation_specifics, String material, String dimensions) {
        super(name, price, stock_quantity, taxation_specifics);
        this.material = material;
        this.dimensions = dimensions;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nMaterial: " + material  +
                ", \nDimensions: " + dimensions
                ;
    }
//    public void update(Furniture product)
//    {
//
//        System.out.println("1. Name \n2. Price\n3. Stock Quantity\n4. Material");
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
//            product.setMaterial(updateMaterial());
//        }
//
//    }

    @Override
    public void update(Products p)
    {
        Furniture product = (Furniture) p;
        int choice = menu();
        updating(choice , product);
    }
    public int menu()
    {
        System.out.println("1. Name \n2. Price\n3. Stock Quantity\n4. Taxation Specifics\n5. Material\n6. Dimensions");
        System.out.println("WHAT TO CHANGE : \n");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    public void updating(int choice , Furniture product)
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
        else if(choice == 4)
        {
            product.setTaxation_specifics(updateTaxation());
        }
        else if (choice == 5)
        {
            product.setMaterial(updateMaterial());
        }
        else if (choice == 6)
        {
            product.setMaterial(updateDimension());
        }
    }

    public String updateMaterial()
    {
        System.out.println("Enter new Material");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    public String updateDimension()
    {
        System.out.println("Enter new Dimension");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    public String view()
    {
       return super.view() + String.format("Material : %s\nDimensions : %s\n",material,dimensions);
    }
}
