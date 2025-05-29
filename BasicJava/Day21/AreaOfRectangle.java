class Shape 
{
    public double area() 
    {
        return 0.0;
    }
}

class Rectangle extends Shape 
{
    private final double length;
    private final double width;

    public Rectangle(double length, double width) 
    {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() 
    {
        return length * width;
    }
}

public class AreaOfRectangle 
{
    public static void main(String[] args) 
    {
        Shape shape = new Shape();
        shape.area();

        Rectangle rect = new Rectangle(10, 2);
        System.out.println("Area of Rectangle: " + rect.area());  
    }
}
