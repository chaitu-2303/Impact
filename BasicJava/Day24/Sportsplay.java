package BasicJava.Day24;

class Sports 
{
    public void play() 
    {
        System.out.println("Playing a sport");
    }
}

class Football extends Sports 
{
    @Override
    public void play() 
    {
        System.out.println("Playing Football");
    }
}

class Basketball extends Sports 
{
    @Override
    public void play() 
    {
        System.out.println("Playing Basketball");
    }
}

class Rugby extends Sports 
{
    @Override
    public void play() 
    {
        System.out.println("Playing Rugby");
    }
}

public class Sportsplay 
{
    public static void main(String[] args) 
    {
        Sports sports = new Sports();
        Football football = new Football();
        Basketball basketball = new Basketball();
        Rugby rugby = new Rugby();
        sports.play();
        football.play();
        basketball.play();
        rugby.play();
    }
}
