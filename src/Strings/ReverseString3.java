package Strings;

public class ReverseString3 
{
    public static void main(String[] args) 
    {
        // Case 3 = i d e v r u t a h c   r u h d a m   -- Reverse
        
        String str1 = "madhur chaturvedi";
        String str2= " ";

        for(int i=str1.length()-1;i>=0;i--)
        {
            str2 = str2+str1.charAt(i)+" ";
        }
        System.out.println(str2);
        
    }

}
