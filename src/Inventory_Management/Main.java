package Inventory_Management;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Inventory of how many products :- ");
        Inventory inventory = new Inventory(sc.nextInt());
        Menu.menu(inventory);
    }

}
