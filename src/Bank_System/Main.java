package Bank_System;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int flag = 9999 ;
        int q = 9999;
        int x = 9999;
        System.out.println("************Bank Management System**************\n\n\n");
        System.out.println("How many maximum customers do you want in the bank :  ");
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        Customer_Actions C = new Customer_Actions(s);
        Admin_Actions A = new Admin_Actions();
        Admin admin = new Admin();
        Menu.mode();
        do {
            x = sc.nextInt();
            if (x == 2)
            {
                System.out.println("\nDo u want to Log In or Register a new account ? ");
                System.out.println("Enter 1 to log in and 2 to Register");
                System.out.println("Enter your choice : ");
                int w = sc.nextInt();
                if(w == 2)
                {
                    C.register();
                    System.out.println("\nPress 1 to Log In and Press 2 to Exit and Press 3 to go to Mode");
                    q = sc.nextInt();
                    if (q == 1)
                    {
                        flag = 1;
                    }
                    else if (q == 2)
                    {
                        Menu.exit();
                    }
                    else if (q == 3)
                    {
                        Menu.mode();
                    }


                }

                if (w == 1 || flag == 1 )
                {
                    boolean p = C.login();


                        do {
                            if (p == true)
                            {
                                Menu.menu();
                            q = sc.nextInt();
                            if (q == 1) {
                                C.viewAccount();
                                System.out.println("\nPress 1 to go back to Menu and Press 2 to Exit and press 3 to go to Mode");
                                int c = sc.nextInt();
                                if (c == 1) {

                                }
                                else if (c == 2)
                                {
                                    Menu.exit();
                                    q = 6;
                                }
                                else if (c == 3)
                                {
                                    Menu.mode();
                                    break;
                                }
                            } else if (q == 2) {
                                C.deposit();
                                System.out.println("\nPress 1 to go back to Menu and Press 2 to Exit and Press 3 to go to Mode");
                                int c = sc.nextInt();
                                if (c == 1)
                                {

                                } else if (c == 2) {
                                    Menu.exit();
                                    q = 6;
                                } else if (c == 3) {
                                    Menu.mode();
                                    break;
                                }
                            } else if (q == 3) {
                                C.withdraw();
                                System.out.println("\nPress 1 to go back to Menu and Press 2 to Exit and press 3 to go to Mode");
                                int c = sc.nextInt();
                                if (c == 1) {

                                } else if (c == 2) {
                                    Menu.exit();
                                    q = 6;
                                } else if (c == 3) {
                                    Menu.mode();
                                    break;
                                }
                            } else if (q == 4) {
                                C.update();
                                System.out.println("\nPress 1 to go back to Menu and Press 2 to Exit and press 3 to go to Mode");
                                int c = sc.nextInt();
                                if (c == 1) {

                                } else if (c == 2) {
                                    Menu.exit();
                                    q = 6;
                                } else if (c == 3) {
                                    Menu.mode();
                                    break;
                                }
                            } else if (q == 5) {
                                C.transaction();
                                System.out.println("\nPress 1 to go back to Menu and Press 2 to Exit and press 3 to go to Mode");
                                int c = sc.nextInt();
                                if (c == 1) {

                                } else if (c == 2) {
                                    Menu.exit();
                                    q = 6;
                                } else if (c == 3) {
                                    Menu.mode();
                                    break;
                                }
                            }
                            else if (q == 6)
                            {
                                Menu.exit();
                            }
                        }
                            else if (!p)
                            {
                                System.out.println("\nWrong Username or Password!!!");
                                System.out.println("Enter 1 to Log In again and 2 to Exit and 3 to go to Mode");
                                int n = sc.nextInt();
                                if (n == 1)
                                {
                                    p = C.login();
                                }
                                else if (n == 2)
                                {
                                    Menu.exit();
                                    q = 6;
                                    break;
                                }
                                else if (n == 3)
                                {
                                    Menu.mode();
                                    break;
                                }
                            }
                        }while (q!=6);






                }



            }
            if (x == 1)
            {
                System.out.println("\nAre you Registered or Do you want to Sign In ?");
                System.out.println("Press 1 to Sign In and 2 to Register");
                int d = sc.nextInt();
                if (d == 2) {
                    admin.signUp();
                    System.out.println("\nPress 1 to Log In and 2 to Exit and Press 3 to go to Mode");
                     q = sc.nextInt();
                    if (q == 1)
                    {
                        flag = 2;
                    }
                    else if (q == 2)
                    {
                        Menu.exit();
                    }
                    else if (q == 3)
                    {
                        Menu.mode();
                    }
                }
                if (d == 1 || flag == 2)
                {
                    boolean m = admin.login();

                        do {
                            if (m)
                            {
                                Menu.admin_menu();
                            q = sc.nextInt();
                            if (q == 1) {
                                A.view(C.customers);
                                System.out.println("\nPress 1 to go back to Menu and Press 2 to Exit and Press 3 to go to Mode");
                                int c = sc.nextInt();
                                if (c == 1) {

                                } else if (c == 2) {
                                    Menu.exit();
                                    q = 6;
                                } else if (c == 3) {
                                    Menu.mode();
                                    break;
                                }
                            }
                            if (q == 2) {
                                A.add(C.customers);
                                System.out.println("\nPress 1 to go back to Menu and Press 2 to Exit and Press 3 to go to Mode");
                                int c = sc.nextInt();
                                if (c == 1) {

                                } else if (c == 2) {
                                    Menu.exit();
                                    q = 6;
                                } else if (c == 3) {
                                    Menu.mode();
                                    break;
                                }
                            }
                            if (q == 3) {
                                A.delete(C.customers);
                                System.out.println("\nPress 1 to go back to Menu and Press 2 to Exit and Press 3 to go to Mode");
                                int c = sc.nextInt();
                                if (c == 1) {

                                } else if (c == 2) {
                                    Menu.exit();
                                    q = 6;
                                } else if (c == 3) {
                                    Menu.mode();
                                    break;
                                }
                            }
                            if (q == 4) {
                                A.change(C.customers);
                                System.out.println("\nPress 1 to go back to Menu and Press 2 to Exit and Press 3 to go to Mode");
                                int c = sc.nextInt();
                                if (c == 1) {

                                } else if (c == 2) {
                                    Menu.exit();
                                    q = 6;
                                } else if (c == 3) {
                                    Menu.mode();
                                    break;
                                }
                            }
                            if (q == 5) {
                                admin.change();
                                System.out.println("\nPress 1 to go back to Menu and Press 2 to Exit and Press 3 to go to Mode");
                                int c = sc.nextInt();
                                if (c == 1) {

                                } else if (c == 2) {
                                    Menu.exit();
                                    q = 6;
                                } else if (c == 3) {
                                    Menu.mode();
                                    break;
                                }
                            } else if (q == 6) {
                                Menu.exit();
                            }
                        }
                            else if (!m)
                            {
                                System.out.println("\nWrong Username or Password!!!");
                                System.out.println("Enter 1 to Log In again and 2 to Exit and 3 to go to Mode");
                                int n = sc.nextInt();
                                if (n == 1)
                                {
                                    m = admin.login();
                                }
                                else if (n == 2)
                                {
                                    Menu.exit();
                                    q = 6;
                                    break;
                                }
                                else if (n == 3)
                                {
                                    Menu.mode();
                                    break;
                                }
                            }
                        }while (q!=6);


                }


            }
        }while (q!=6);




    }
}
