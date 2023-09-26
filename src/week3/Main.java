package week3;


import jdk.swing.interop.SwingInterOpUtils;

public class Main {
    public static void main(String[] args) {
        Deck d1 = new Deck();
        Game g1 = new Game();
        System.out.println(d1);
        System.out.println("After shuffle");
        System.out.println(d1.shuffle());
        g1.distribute(d1);
        System.out.println(g1);





    }
}
