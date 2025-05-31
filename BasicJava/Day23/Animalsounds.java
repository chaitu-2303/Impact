class Animal 
{
    void sound() 
    {
        System.out.println("Animal Roars");
    }
}

class Cat extends Animal 
{
    @Override
    void sound() 
    {
        System.out.println("Meow");
    }
}

class Bird extends Animal 
{
    @Override
    void sound() 
    {
        System.out.println("Chirp");
    }
}

public class Animalsounds
{
    public static void main(String[] args) 
    {
        Animal Animal = new Animal();
        Animal Cat = new Cat();
        Animal Bird = new Bird();

        Animal.sound(); 
        Cat.sound();    
        Bird.sound();   
    }
}
