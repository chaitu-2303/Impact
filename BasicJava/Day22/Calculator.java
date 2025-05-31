
class Calculator
{
    int add(int a, int b)
    {
        return a + b;
    }
    double add(double a, double b)
    {
        return a + b;
    }
    int add (int a, int b, int c)
    {
        return a + b + c;
    }
}

class Main
{
    public static void main(String[] args) 
    {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(5, 7)); 
        System.out.println(calculator.add(4.8, 6.2));
        System.out.println(calculator.add(1, 2, 3));
    }
}