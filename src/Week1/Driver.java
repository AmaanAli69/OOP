package Week1;

public class Driver {
    public static void main(String[] args) {
        Rectangle var1 = new Rectangle(5,10);
        Rectangle var2 = new Rectangle(2 , 7);
        System.out.println("Area is : "+var1.calArea());
        System.out.println("Perimeter is : "+var1.calPerimeter());
        System.out.println("Area is : "+var2.calArea());
        System.out.println("Perimeter is : "+var2.calPerimeter());
        Rectangle.comparison(var1.calArea(), var2.calArea());
        Rectangle var3 = var1.compare(var1,var2);
        System.out.println(var3);
        System.out.println(var1.compare(var1,var2));
        var1.setX(0);
        var1.setY(5);
        var2.setX(3);
        var2.setY(2);
        System.out.println(Rectangle.intersect(var1,var2));
        boolean check = Rectangle.intersect(var1,var2);
        if( check == true)
        {
            System.out.println("The two rectangles overlap");
        }
        else
        {
            System.out.println("The two rectangles don't overlap");
        }
    }
}
