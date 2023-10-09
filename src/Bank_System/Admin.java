package Bank_System;

import java.util.Objects;
import java.util.Scanner;

public class Admin {
    private String name;
    private String username;
    private String password;

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public boolean login()
    {
        System.out.println("\nEnter Username : ");
        Scanner sc = new Scanner(System.in);
        String user = sc.nextLine();
        System.out.println("Enter Password : ");
        String pass = sc.nextLine();
        if (Objects.equals(user,username) && Objects.equals(pass,password))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void signUp()
  {
      System.out.println("\nEnter your Name : ");
      Scanner sc = new Scanner(System.in);
      String name = sc.nextLine();
      setName(name);
      System.out.println("Enter Username : ");
      String user = sc.nextLine();
      setUsername(user);
      System.out.println("Enter Password : ");
      String pass = sc.nextLine();
      setPassword(pass);
      System.out.println("\n********You have been signed up!!!***********");
  }
  public void change()
  {
      System.out.println("\nEnter new Username : ");
      Scanner sc = new Scanner(System.in);
      String user = sc.nextLine();
      setUsername(user);
      System.out.println("Enter new Password : ");
      String pass = sc.nextLine();
      setPassword(pass);
      System.out.println("Changed Successfully!!!");
  }
}
