package BasicJava.Day24;

public class Rectangle 
{
    private double length;
    private double width;

    private  double getLength() 
    {
        return length;
    }

    public void setLength(double length) 
    {
        this.length = length;
    }

    public double getWidth() 
    {
        return width;
    }

    public void setWidth(double width) 
    {
        this.width = width;
    }

    public static void main(String[] args) 
    {
        Rectangle rect = new Rectangle();
        rect.setLength(10);
        rect.setWidth(5);
        System.out.println("Length : " + rect.getLength());
        System.out.println("Width : " + rect.getWidth());
        
    }
}