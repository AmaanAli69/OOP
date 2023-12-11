package Inventory_Management;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Inventory
{
    Products[] products ;
    int flag = 0;
    Inventory(int maxProducts)
    {
        products = new Products[maxProducts];
    }
    public void addProduct(Object o)
    {
        for (int i = 0 ; i < products.length ; i++ )
        {
            if (products[i] == null)
            {
                products[i] = (Products) o;
                break;
            }
        }
    }
    public void removeProduct(Object o)
    {
        Products p = (Products) o;
        for (int i = 0 ; i < products.length ; i++)
        {
            if (Objects.equals(products[i] , p))
            {
                products[i] = null;
                break;
            }
        }
    }
    public void removeProduct(int ID)
    {

        for (int i = 0 ; i < products.length ; i++)
        {
            if (Objects.equals(products[i].getProductID() , ID))
            {
                products[i] = null;
                break;
            }
        }
    }
    public void searchProduct(int ID)
    {
        for (Products product : products) {
            if (Objects.equals(product.getProductID(), ID)) {

                System.out.println(product.view());
                break;
            }
        }
        }
        public void updateProduct(int ID)
        {
            for (Products product : products) {

                if (Objects.equals(product.getProductID(), ID))
                {
                    System.out.println(product.view());
                    product.update(product);
                    break;
                }

            }
        }

    @Override
    public String toString() {
        return
                "Products : \n" + Arrays.toString(products)
                ;
    }
    public void view()
    {
        viewFurniture();
        System.out.println("\n\n");
        viewElectronics();
        System.out.println("\n\n");
        viewGroceries();
        System.out.println("\n\n");

    }
    public void viewFurniture() {
        flag = 0;
        System.out.println("\nFurniture Items :- \n");
        for (Products product : products) {
            if (product != null) {
                if (product instanceof Furniture) {
                    System.out.println(product.view());
                    flag = 1;
                }
            }
        }
        if (flag == 0)
        {
            System.out.println("NO Items to show");
        }
    }
    public void viewElectronics()
    {
        flag = 0;
        System.out.println("Electronic Items :- \n");
        for (Products product : products) {
            if (product != null)
            {
                if (product instanceof Electronics)
                {
                    System.out.println(product.view());
                    flag = 1;
                }
            }
        }
        if (flag == 0)
        {
            System.out.println("NO Items to show");
        }

    }
    public void viewGroceries()
    {
        flag = 0;
        System.out.println("Grocery Items :- \n");
        for (Products product : products) {
            if (product != null) {
                if (product instanceof Groceries) {
                    System.out.println(product.view());
                    flag = 1;
                }
            }
        }
        if (flag == 0)
        {
            System.out.println("NO Items to show");
        }
    }


}
