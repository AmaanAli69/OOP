package Inventory_Management;

import java.util.Scanner;

public class Menu {

    static int exit = 1;

    public static void menu(Inventory inventory) {
        while (exit == 1) {
            int mainMenu = mainMenu();
            if (mainMenu == 1) {
                int addingMenu = addingMenu();

                if (addingMenu == 1) {
                    int electronicsMenu = electronicsMenu();

                    if (electronicsMenu == 1) {
                        inventory.addProduct(addingLaptopMenu());
                    } else if (electronicsMenu == 2) {
                        inventory.addProduct(addingAudio());
                    }
                }
                if (addingMenu == 2) {
                    int furnitureMenu = furnitureMenu();

                    if (furnitureMenu == 1) {
                        inventory.addProduct(addingSeatingMenu());
                    } else if (furnitureMenu == 2) {
                        inventory.addProduct(addingTableMenu());
                    }
                }
                if (addingMenu == 3) {
                    int groceriesMenu = groceriesMenu();

                    if (groceriesMenu == 1) {
                        inventory.addProduct(addingFreshMenu());
                    } else if (groceriesMenu == 2) {
                        inventory.addProduct(addingCannedGoodsMenu());
                    }
                }
            } else if (mainMenu == 2) {
                inventory.removeProduct(removingMenu());
                System.out.println("Enter 1 to go back to Menu and 2 to Exit");
                Scanner sc = new Scanner(System.in);
                exit = sc.nextInt();
            } else if (mainMenu == 3) {
                inventory.searchProduct(searchingMenu());
                System.out.println("Enter 1 to go back to Menu and 2 to Exit");
                Scanner sc = new Scanner(System.in);
                exit = sc.nextInt();
            } else if (mainMenu == 5) {
                inventory.view();
                System.out.println("Enter 1 to go back to Menu and 2 to Exit");
                Scanner sc = new Scanner(System.in);
                exit = sc.nextInt();
            } else if (mainMenu == 4) {
                inventory.updateProduct(updatingMenu());
                System.out.println("Enter 1 to go back to Menu and 2 to Exit");
                Scanner sc = new Scanner(System.in);
                exit = sc.nextInt();
            }
        }
    }

    public static int mainMenu() {
        System.out.println(" 1. Add \n 2. Remove \n 3. Search \n 4. Update\n 5. Display Inventory");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static int addingMenu() {
        System.out.println("What type of product to add :- \n");
        System.out.println(" 1. Electronics \n 2. Furniture \n 3. Groceries");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static int removingMenu() {
        System.out.println("Enter ID of the product you want to remove : ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static int searchingMenu() {
        System.out.println("Enter ID of the product you want to search : ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static int updatingMenu() {
        System.out.println("Enter ID of the product you want to update : ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static int electronicsMenu() {
        System.out.println("What to add :- \n");
        System.out.println("1. Laptop \n 2. Audio Devices");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static int furnitureMenu() {
        System.out.println("What to add :- \n");
        System.out.println("1. Seating \n 2. Table");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static int groceriesMenu() {
        System.out.println("What to add :- \n");
        System.out.println("1. Fresh Goods \n 2. Canned Goods");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static FreshGoods addingFreshMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of the Fresh Goods:");
        String name = sc.nextLine();
        System.out.println("Enter price of the Fresh Goods:");
        double price = sc.nextDouble();
        System.out.println("Enter stock quantity of the Fresh Goods:");
        int quantity = sc.nextInt();
        System.out.println("Enter taxation specifics of the Fresh Goods:");
        int tax = sc.nextInt();
        System.out.println("Enter the expiration date of the Fresh Goods:");
        sc.nextLine();
        String mat = sc.nextLine();
        System.out.println("Enter the nutritional values of the Fresh Goods:");
        String dim = sc.nextLine();
        System.out.println("Enter origin of the Fresh Goods:");
        String shape = sc.nextLine();
        System.out.println("Enter 1 to go back to Menu and 2 to Exit");
        exit = sc.nextInt();
        return new FreshGoods(name, price, quantity, tax, mat, dim, shape);
    }

    public static CannedGoods addingCannedGoodsMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of the Canned Goods:");
        String names = sc.nextLine();
        System.out.println("Enter price of the seating Canned Goods:");
        double prices = sc.nextDouble();
        System.out.println("Enter stock quantity of the seating Canned Goods:");
        int quantitys = sc.nextInt();
        System.out.println("Enter taxation specifics of the seating Canned Goods:");
        int taxs = sc.nextInt();
        System.out.println("Enter the expiration date of Canned Goods:");
        sc.nextLine();
        String mats = sc.nextLine();
        System.out.println("Enter the nutritional values Canned Goods:");
        String dims = sc.nextLine();
        System.out.println("Enter can size of the seating Canned Goods:");
        int load = sc.nextInt();
        System.out.println("Enter 1 to go back to Menu and 2 to Exit");
        exit = sc.nextInt();
        return new CannedGoods(names, prices, quantitys, taxs, mats, dims, load);
    }

    public static Seating addingSeatingMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of the seating furniture:");
        String names = sc.nextLine();
        System.out.println("Enter price of the seating furniture:");
        double prices = sc.nextDouble();
        System.out.println("Enter stock quantity of the seating furniture:");
        int quantitys = sc.nextInt();
        System.out.println("Enter taxation specifics of the seating furniture:");
        int taxs = sc.nextInt();
        System.out.println("Enter the material of the seating furniture:");
        sc.nextLine();
        String mats = sc.nextLine();
        System.out.println("Enter load capacity of the seating furniture:");
        int load = sc.nextInt();
        System.out.println("Enter the dimensions of the seating furniture:");
        sc.nextLine();
        String dims = sc.nextLine();
        System.out.println("Enter 1 to go back to Menu and 2 to Exit");
        exit = sc.nextInt();
        return new Seating(names, prices, quantitys, taxs, mats, dims, load);
    }

    public static Table addingTableMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of the table:");
        String name = sc.nextLine();
        System.out.println("Enter price of the table:");
        double price = sc.nextDouble();
        System.out.println("Enter stock quantity of the table:");
        int quantity = sc.nextInt();
        System.out.println("Enter taxation specifics of the table:");
        int tax = sc.nextInt();
        System.out.println("Enter the material of the table:");
        sc.nextLine();
        String mat = sc.nextLine();
        System.out.println("Enter the dimensions of the table:");
        String dim = sc.nextLine();
        System.out.println("Enter shape of the table:");
        String shape = sc.nextLine();
        System.out.println("Enter 1 to go back to Menu and 2 to Exit");
        exit = sc.nextInt();
        return new Table(name, price, quantity, tax, mat, dim, shape);
    }

    public static Laptop addingLaptopMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of the laptop:");
        String namel = sc.nextLine();
        System.out.println("Enter price of the laptop:");
        double pricel = sc.nextDouble();
        System.out.println("Enter stock quantity of the laptop:");
        int quantityl = sc.nextInt();
        System.out.println("Enter taxation specifics of the laptop:");
        int taxl = sc.nextInt();
        System.out.println("Enter Power consumption of the laptop:");
        int powerl = sc.nextInt();
        System.out.println("Enter warranty of the laptop:");
        int warrantyl = sc.nextInt();
        System.out.println("Enter Processor type of the laptop:");
        sc.nextLine();
        String processor = sc.nextLine();
        System.out.println("Enter RAM of the laptop:");
        int RAM = sc.nextInt();
        System.out.println("Enter screen dimensions of the laptop:");
        sc.nextLine();
        String dimensions = sc.nextLine();
        System.out.println("Enter 1 to go back to Menu and 2 to Exit");
        exit = sc.nextInt();
        return new Laptop(namel, pricel, quantityl, taxl, powerl, warrantyl, processor, RAM, dimensions);
    }

    public static AudioDevices addingAudio() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of the Audio Device:");
        String namea = sc.nextLine();
        System.out.println("Enter price of the Audio Device:");
        double pricea = sc.nextDouble();
        System.out.println("Enter stock quantity of the Audio Device:");
        int quantitya = sc.nextInt();
        System.out.println("Enter taxation specifics of the Audio Device:");
        int taxa = sc.nextInt();
        System.out.println("Enter Power consumption of the Audio Device:");
        int powera = sc.nextInt();
        System.out.println("Enter warranty of the Audio Device:");
        int warrantya = sc.nextInt();
        System.out.println("Enter screen Audio type of the Audio Device:");
        sc.nextLine();
        String type = sc.nextLine();
        System.out.println("Enter 1 to go back to Menu and 2 to Exit");
        exit = sc.nextInt();
        return new AudioDevices(namea, pricea, quantitya, taxa, powera, warrantya, type);
    }
}
