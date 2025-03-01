package Strings;

import java.util.Scanner;

public class PalindronePrg 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String");
        String str = sc.nextLine();
        String str2 = "";
    
        for(int i = str.length()-1; i>=0; i--)
        {
            str2 = str2+str.charAt(i);
        }
        System.out.println(str2);
        if(str2.equals(str))
        {
            System.out.println("Reverse of the String is same so --> Palindrone");
        }
        else
        {
            System.out.println("Reverse of the String is not same so --> Not Palindrone");
        }
    }
}
