import java.util.Scanner;

public class Vowel
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String text = sc.nextLine();    
        try 
        {
            System.out.println("Original string" + " : " + text);
            checkVowels (text);
            System.out.println("String contains vowels.");
        } 
        catch (Exception e) 
        {
            System.out.println("Error:" +e.getMessage());
         }
    }
    public static void checkVowels (String text) throws Exception
    {
        boolean Vowels =false;
        String vowels ="aeiouAEIOU";
            
        for (int i= 0; i < text.length(); i++) 
        {
            char ch =text .charAt(i);
            if (vowels.contains (String.valueOf(ch))) 
            {
                Vowels= true;
                break;
            }
        }
        if (!Vowels)
        {
            throw new Exception("String does not contain any vowels.");
        }
    }
}