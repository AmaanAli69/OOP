package Inventory_Management;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class CannedGoods extends Groceries{
    private int can_size;

    public CannedGoods(String name, double price, int stock_quantity, int taxation_specifics,  String expiration_date, String nutritional_values, int can_size) {
        super(name, price, stock_quantity, taxation_specifics, expiration_date, nutritional_values);
        this.can_size = can_size;
    }

    public int getCan_size()
    {
        return can_size;
    }

    public void setCan_size(int can_size)
    {
        this.can_size = can_size;
    }
    public void update(Products p) {
        super.update(p);
    }

    @Override
    public int menu() {
        System.out.println("1. Name \n2. Price\n3. Stock Quantity\n4. Taxation Specifics\n5.Expiration Date\n6. Nutritional Values\n7. Can Size");
        System.out.println("WHAT TO CHANGE : \n");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    @Override
    public void updating(int choice, Groceries product) {
        super.updating(choice, product);
        if (choice == 7)
        {
            CannedGoods goods = (CannedGoods) product;
            goods.setCan_size(updateCan());
        }
    }
    public int updateCan()
    {
        System.out.println("Enter new Can Size");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }


    @Override
    public String toString() {
        return super.toString() +
                "\nCan size: " + can_size
                ;
    }
    public String view() {
        return super.view() + String.format("Can Size : %s\n\n",can_size);
    }

}
