package BasicJava.Day17;

public class Countthesumofnumbersinastring 
{
    public static void main(String[] args) 
    {
        String s = "1abc45";
        int sum = 0;
        String temp="";
        for(int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            if(Character.isDigit(c))
            {
                temp+=c;
            }
            else
            {
                if(!temp.equals(""))
                {
                    sum+=Integer.parseInt(temp);
                    temp="";
                }
            }
        }
        if(!temp.equals(""))
        {
            sum+=Integer.parseInt(temp);
        }
        System.out.println(sum);
    }
}