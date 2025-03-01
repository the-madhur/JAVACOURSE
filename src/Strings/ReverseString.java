package Strings;

public class ReverseString 
{
        public static void main(String[] args) {
            
            // case 1 = rudham  -- Reverse

            String str1 = "madhur";
            String str2 = " ";
    
            for(int i = str1.length() - 1; i>=0; i--)
            {
                str2 = str2 + str1.charAt(i);
            }
    
            System.out.println(str2);
        }

}
