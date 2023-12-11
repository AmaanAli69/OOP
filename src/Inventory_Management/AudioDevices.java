package Inventory_Management;

import java.util.Scanner;

public class AudioDevices extends Electronics{
    private String audioType;

    public AudioDevices(String name, double price, int stock_quantity, int taxation_specifics,  int power_consumption, int warranty, String audioType) {
        super(name, price, stock_quantity, taxation_specifics, power_consumption, warranty);
        this.audioType = audioType;
    }

    public String getAudioType() {
        return audioType;
    }

    public void setAudioType(String audioType)
    {
        this.audioType = audioType;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\naudioType: " + audioType
                ;
    }

    public void update(Products p) {
        super.update(p);
    }
    public int menu()
    {
        System.out.println("1. Name \n2. Price\n3. Stock Quantity\n4. Taxation Specifics\n5. Power Consupmtion  \n6. Warranty\n7. Audio Type ");
        System.out.println("WHAT TO CHANGE : \n");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();

    }
    public void updating(int choice , Electronics product)
    {

        super.updating(choice,product);
        if (choice == 7)
        {
            AudioDevices p = (AudioDevices) product;
            p.setAudioType(updateAudioType());
        }

    }
    public String updateAudioType()
    {
        System.out.println("Enter new Audio Type");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    public String view() {
        return super.view() + String.format("Audio Type : %s\n\n",audioType);
    }

}
