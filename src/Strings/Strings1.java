package Strings;

public class Strings1 {
    public static void main(String[] args) {

        String s1 = "madhur";
        String s2 = s1.concat(" Chaturvedi");
        System.out.println(s2);   //

        String s3 = new String ("madhur");
         s3 = s3.concat(" Chaturvedi"); // here we concatenate string and update in existing String
        System.out.println(s3);

    }
}
