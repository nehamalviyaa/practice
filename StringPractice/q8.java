//Comparing two String (case sensitive) .s1 ="Test" s2="test" result not equal(non-zero value) 
import java.util.Scanner;
public class q8 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first string");
        String first = sc.next();

        System.out.println("enter second string");
        String second = sc.next();

        char[] s1 = first.toCharArray();
        char[] s2 = second.toCharArray();

       if(s1.length != s2.length){
        System.out.println("Strings are not eual");
        return;
       }

       for(int i = 0; i<s1.length; i++){
        if(s1[i] != s2[i]){
            System.out.println("Strings are not equal");
            return;
        }
       }

       System.out.println("Strings are equal");
    }
 

    
}
