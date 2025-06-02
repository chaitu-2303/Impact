package BasicJava.Day24;

class Sum {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

class Sumof2numbers {
    public static void main(String[] args) 
    {
        Sum s = new Sum();
        System.out.println(s.add(10, 5));
        System.out.println(s.add(10.5, 5.5));
    }
}