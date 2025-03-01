package Strings;

public class StringComparison 
{
    public static void main(String[] args) 
    {
        String s1 = "Madhur";
        String s2 = "Madhur";
        String s5 = "MADHUR";

        String s3 = new String("HP");
        String s4 = new String("Madhur");
        String s6 = new String("Madhur");

        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1==s4);
        System.out.println(s4==s6);

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s4.equals(s6));

        System.out.println(s2.equalsIgnoreCase(s6));
        System.out.println(s2.equalsIgnoreCase(s4));
        System.out.println(s5.equalsIgnoreCase(s6));
 
    }
    
}