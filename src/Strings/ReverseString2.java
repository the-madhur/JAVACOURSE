package Strings;

public class ReverseString2 
{
    public static void main(String[] args) 
    {
        // case 2 =  chaturvedi madhur   - - Reverse

        String str1 = "madhur chaturvedi";
        String str2 = " ";
        String sarr[] = str1.split(" ");  // where it find space so split it and store in array 

        for(int i=sarr.length - 1;i>=0;i--)
        {
            str2 = str2 + sarr[i] + " ";
        }
        System.out.println(str2);
        
    }

}
