package Bank_System;

import java.util.Date;

public class Customer {
    private String name;
    private String username;
    private String password;
    private String phone;
    private String email;
    private String  acc_no;
    private String acc_type;
    private long balance;


    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }





    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(String acc_no) {
        this.acc_no = acc_no;
    }

    public String getAcc_type() {
        return acc_type;
    }

    public void setAcc_type(String acc_type) {
        this.acc_type = acc_type;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }
    public void print()
    {
        System.out.println("Name :" +name);
        System.out.println("Username : "+username);
        System.out.println("Phone : "+phone);
        System.out.println("Email : "+email);
        System.out.println("Account Number : "+acc_no);
        System.out.println("Account type : "+acc_type);
        System.out.println("Balance : "+balance);
    }


}
