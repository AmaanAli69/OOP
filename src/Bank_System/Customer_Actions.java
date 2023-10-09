package Bank_System;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

public class Customer_Actions {
    public Customer[] customers;
    private int key;

    public Customer_Actions(int maxCustomers) {
        customers = new Customer[maxCustomers];
        for (int i = 0; i < customers.length; i++) {
            Customer newCustomer = new Customer();
            customers[i] = newCustomer;
        }
    }


    public void register() {
        for (int i = 0; i < customers.length; i++) {
            if (customers[i].getAcc_no() == null) {
                System.out.println("\nEnter Name : ");
                Scanner sc = new Scanner(System.in);
                String name = sc.nextLine();


                customers[i].setName(name);
                System.out.println("Enter Username : ");
                String username = sc.nextLine();
                customers[i].setUsername(username);
                System.out.println("Enter Password : ");
                String password = sc.nextLine();
                customers[i].setPassword(password);
                System.out.println("Enter Phone Number : ");
                String phone = sc.nextLine();
                customers[i].setPhone(phone);
                System.out.println("Enter Email : ");
                String email = sc.nextLine();
                customers[i].setEmail(email);
                System.out.println("You have been registered!!!");
                System.out.println("Type of Account(Current or Saving) : ");
                String type = sc.nextLine();
                customers[i].setAcc_type(type);
                UUID uuid = UUID.randomUUID();
                String acc_no = uuid.toString();
                customers[i].setAcc_no(acc_no);
                System.out.println("Money to Deposit : ");
                Long balance = sc.nextLong();
                customers[i].setBalance(balance);

                System.out.println("Your Account has been created!!!");
                System.out.println("Here is Your unique and new Account ID : " + customers[i].getAcc_no());
                break;
            }
        }
    }

    public boolean login() {
        System.out.println("\nEnter Username : ");
        Scanner sc = new Scanner(System.in);
        String user = sc.nextLine();
        System.out.println("Enter Password");
        String pass = sc.nextLine();
        for (int i = 0; i < customers.length; i++) {
            if (Objects.equals(user, customers[i].getUsername()) && Objects.equals(pass, customers[i].getPassword())) {
                key = i;
                return true;
            }
        }
        return false;

    }

    public void viewAccount() {

        System.out.println("\nName : " + customers[key].getName());
        System.out.println("Username : " + customers[key].getUsername());
        System.out.println("Phone Number : " + customers[key].getPhone());
        System.out.println("Email : " + customers[key].getEmail());
        System.out.println("Account Type : " + customers[key].getAcc_type());
        System.out.println("Account ID : " + customers[key].getAcc_no());
        System.out.println("Balance :  " + customers[key].getBalance());

    }

    public void deposit() {
        long amount;
        System.out.println("\nEnter the amount you want to deposit : ");
        Scanner sc = new Scanner(System.in);
        amount = sc.nextLong();
        long balance = customers[key].getBalance();
        balance = balance + amount;
        customers[key].setBalance(balance);
        System.out.println("Successfully Deposited!!!");

    }

    public void withdraw() {
        long amount;
        System.out.println("\nEnter the amount you want to withdraw : ");
        Scanner sc = new Scanner(System.in);
        amount = sc.nextLong();
        long balance = customers[key].getBalance();
        if (balance >= amount) {
            balance = balance - amount;
            customers[key].setBalance(balance);
            System.out.println("\nBalance after withdrawal: " + balance);
        } else {
            System.out.println("\nYour balance is less than " + amount + "\tTransaction failed...!!");
        }
    }

    public void update() {
        String choose;
        System.out.println("Which personal detail do you want to change : ");
        System.out.println("(Username / Password / Phone Number / Email) ");
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();
        if (Objects.equals(choice, "Username") || Objects.equals(choice, "username")) {
            System.out.println("\nEnter new Username : ");
            choose = sc.nextLine();
            customers[key].setUsername(choose);
            System.out.println("\nSuccessfully Updated !!!");

        } else if (Objects.equals(choice, "Password") || Objects.equals(choice, "password")) {
            System.out.println("\nEnter new Password : ");
            choose = sc.nextLine();
            customers[key].setUsername(choose);
            System.out.println("\nSuccessfully Updated !!!");
        } else if (Objects.equals(choice, "Phone Number") || Objects.equals(choice, "phone number")) {
            System.out.println("\nEnter new Phone Number : ");
            choose = sc.nextLine();
            customers[key].setUsername(choose);
            System.out.println("\nSuccessfully Updated !!!");
        } else if (Objects.equals(choice, "Email") || Objects.equals(choice, "email")) {
            System.out.println("\nEnter new Email : ");
            choose = sc.nextLine();
            customers[key].setUsername(choose);
            System.out.println("\nSuccessfully Updated !!!");
        }
    }

    public void transaction() {
        long amt;
        int flag = 0;
        System.out.println("\nEnter Your Account Number : ");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

            System.out.println("\nEnter the Account Number to which you wanna make the transaction : ");
            String acc = sc.nextLine();
            System.out.println("\nEnter the Amount that you want to send : ");
            amt = sc.nextLong();
            for (int i = 0; i < customers.length; i++)
            {
                if (Objects.equals(acc, customers[i].getAcc_no()))
                {
                    flag = 1;
                    long balance = customers[i].getBalance();
                    balance = balance + amt;
                    customers[i].setBalance(balance);
                    System.out.println("Successfully Done!!!");
                }

            }
            if (flag == 0)
            {
                System.out.println("\nAccount that you want to transact with does not exist!!!");
            }
        for (int s = 0; s < customers.length; s++) {
            if (Objects.equals(a, customers[s].getAcc_no()))
            {
                long bal = customers[s].getBalance();
                bal = bal - amt ;
                customers[s].setBalance(bal);
                flag = 2;
                break;
            }
            else
            {
                flag = 3;
            }
        }
        if (flag == 3)
        {
            System.out.println("\n Invalid Account Number input!!!");
        }



    }
}
