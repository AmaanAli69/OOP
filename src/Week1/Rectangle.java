package Week1;

public class Rectangle {
    private double length;
    private double width;
    private int x;
    private int y;

    public Rectangle(double length, double width) {
        setWidth(width);
        setLength(length);
    }

    public void setLength(double length) {
        if (length > 0)
            this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        if (width > 0)
            this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double calArea() {
        return length * width;
    }

    public double calPerimeter() {
        if (length > 0 && width > 0) {
            return 2 * length + 2 * width;
        } else {
            return 0.0;
        }

    }
    public static void comparison(double area1 , double area2)
    {
        if(area1 > area2)
        {
            System.out.println("Rectangle 1 is larger than the second rectangle");
        }
        else
        {
            System.out.println("Rectangle 2 is larger than the first rectangle");
        }
    }
    public Rectangle compare(Rectangle obj1 , Rectangle obj2)
    {
        if(obj1.calArea() > obj2.calArea())
        {

            return obj1;

        }
        else
        {

            return obj2;
        }
    }
    public void setX(int x){

        this.x = x;
    }

    public void setY(int y) {

        this.y = y;
    }
    public static boolean intersect(Rectangle r1 , Rectangle r2)
    {
        if((r1.x + r1.length  > r2.x ) && (r2.x + r2.length > r1.x) && (r1.y + r1.width > r2.y) && (r2.y + r2.width > r1.y)  )
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
