package Bank_System;

import java.util.Scanner;

public class Menu {
    public static void menu()
    {

            System.out.println("1. View Account");
            System.out.println("2. Deposit Amount");
            System.out.println("3. Withdraw Amount");
            System.out.println("4. Update Personal Details");
            System.out.println("5. Transaction");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
    }
    public static void exit()
    {
        System.out.println("**********Exiting Bank Management System******************");
        System.out.println("Made BY Amaan Ali Bhatti");
        System.out.println("Roll number : SP23-BCS-015");
    }
  public static void admin_menu()
  {
      System.out.println("1. View All Customers");
      System.out.println("2. Add a Customer");
      System.out.println("3. Delete a Customer");
      System.out.println("4. Change detail of Customer");
      System.out.println("5. Change Username and Password");
      System.out.println("6. Exit");
      System.out.print("Enter your choice: ");
  }
  public static void mode()
  {
      System.out.println("Admin Mode or Customer Mode(Enter 1 for Admin and 2 for Customer) : ");
  }

}
