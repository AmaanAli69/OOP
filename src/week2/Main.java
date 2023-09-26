package week2;

public class Main {
    public static void main(String[] args) {
        Music m1 = new Music("Blank space", "3:40", "Pop", new Dates(20,11,2019),new Singer("Taylor Swift","female", "American", new Dates(12,3,2007)));
        Music m2 = new Music("Attention", "3:45", "Lo-fi", new Dates(15,9,2022),new Singer("Charlie Puth","male", "American", new Dates(9,10,2011)));
        Dates d1 = new Dates(2,5,2023);
        Dates d2 = new Dates(3,5,2023);
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(d1.equals(d2));
        System.out.println(m1.equals(m2));



    }
}
