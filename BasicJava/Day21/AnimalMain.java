class Animal 
{
    public void move() 
    {
        System.out.println("The animal moves.");
    }
}

class Cheetah extends Animal 
{
    @Override
    public void move() 
    {
        System.out.println("The cheetah is running.");
    }
}

public class AnimalMain 
{
    public static void main(String[] args) 
    {
        Animal genericAnimal = new Animal();
        genericAnimal.move();  
        Cheetah cheetah = new Cheetah();
        cheetah.move();        
    }
}