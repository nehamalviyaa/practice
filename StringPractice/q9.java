//compare two strings ignore case.
import java.util.Scanner;
public class q9 {
     
    public static boolean compareString(String first, String second){

        char[] s1 = first.toCharArray();
        char[] s2 = second.toCharArray();

        if(s1.length != s2.length){
            return false;
        }

        for(int i = 0; i<s1.length; i++){
            if(s1[i] != s2[i]){
                return false;
            }
        }

        return true;

    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first string");
        String first = sc.next();
        
        System.out.println("enter the second String");
        String second = sc.next();
      

        boolean result = compareString(first, second);

        System.out.println(result);
        System.out.println("Strings are equal");




    }
    
}
