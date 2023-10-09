package Bank_System;

import java.util.Objects;
import java.util.Scanner;
import java.util.UUID;

public class Admin_Actions  {
    private Admin admin;
    public void view(Customer[] c)
  {
      System.out.println("\n");
      for(int i = 0 ; i < c.length ; i++)
      {
          if (c[i].getAcc_no() != null )
          {
              System.out.println("\n");
              c[i].print();
          }
          else if (c[i].getAcc_no() == null)
          {
            if (i == 0)
                System.out.println("\nNo customers to show!!!");
          }

      }
  }
  public void delete(Customer[] c)
  {
      int flag = 0;
      System.out.println("\nEnter Account Number of the customer you want to delete : ");
      Scanner sc = new Scanner(System.in);
      String id = sc.nextLine();
      for (int i = 0 ; i < c.length ; i++)
      {
          if (Objects.equals(id,c[i].getAcc_no()))
          {
              c[i] = new Customer();
              flag = 1;
              System.out.println("\n Successfully deleted!!!");
          }
      }
      if (flag == 0)
          System.out.println("\nCustomer not found!!!");
  }
  public void add(Customer[] c)
  {
      int flag = 999;
     for (int i = 0 ; i < c.length ; i++)
     {

         if(c[i].getAcc_no() == null)
         {
             System.out.println("\nEnter Name : ");
             Scanner sc = new Scanner(System.in);
             String name = sc.nextLine();
             c[i].setName(name);
             System.out.println("Enter Username : ");
             String username = sc.nextLine();
             c[i].setUsername(username);
             System.out.println("Enter Password : ");
             String password = sc.nextLine();
             c[i].setPassword(password);
             System.out.println("Enter Phone Number : ");
             String phone = sc.nextLine();
             c[i].setPhone(phone);
             System.out.println("Enter Email : ");
             String email = sc.nextLine();
             c[i].setEmail(email);
             System.out.println("Type of Account(Current or Saving) : ");
             String type = sc.nextLine();
             c[i].setAcc_type(type);
             UUID uuid = UUID.randomUUID();
             String acc_no = uuid.toString();
             c[i].setAcc_no(acc_no);
             System.out.println("Money to Deposit : ");
             Long balance = sc.nextLong();
             c[i].setBalance(balance);
             System.out.println("***********Account has been created!!!***************");
             System.out.println("Here is the unique and new Account ID : "+c[i].getAcc_no());
             flag = 1;
             break;
         }


     }
     if(flag == 999)
     {
         System.out.println("\nCustomers limit has reached its maximum!!!");
     }
  }
  public void change(Customer[] c)
  {
      int flag = 0 ;
      System.out.println("Enter Account Number of the account you want to make changes in : ");
      Scanner sc = new Scanner(System.in);
      String id  = sc.nextLine();
      for (int i = 0 ; i < c.length ;i++ )
      {
          if(Objects.equals(id,c[i].getAcc_no()))
          {
              flag = 1;
              System.out.println("Which detail do you want to change : ");
              System.out.println("Account Number / Account Type");
              String choice = sc.nextLine();
              if(Objects.equals(choice,"Account Number") && Objects.equals(choice,"account number"))
              {
                  System.out.println("Enter new Account Number : ");
                  String choose = sc.nextLine();
                  c[i].setAcc_no(choose);
                  System.out.println("Successfully changed!!!");
              }
              if(Objects.equals(choice,"Account Type") && Objects.equals(choice,"account type"))
              {
                  System.out.println("Enter new Account Type : ");
                  String choose = sc.nextLine();
                  c[i].setAcc_type(choose);
                  System.out.println("Successfully changed!!!");
              }
          }
      }
      if (flag == 0)
      {
          System.out.println("\nCustomer not found!!!");
      }
  }



}
