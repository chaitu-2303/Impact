import java.util.*;
public class Hashmap 
{
    public static void main(String[] args) 
    {
        HashMap <Integer, String> Ch = new HashMap<>();
        int arr[] = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) 
        {
            Ch.put(arr[i],1);
        }
        System.out.println(Ch);
    }     
}