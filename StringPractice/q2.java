//Input name of a person and count how many vowels it contains. Use String class methods.
import java.util.Scanner;
public class q2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the string");
        String name = sc.next();

          char[] str = name.toLowerCase().toCharArray();

          int count = 0;

          for(int i = 0;i<str.length;i++){
            if(str[i] == 'a' && str[i] == 'e' && str[i] == 'i' && str[i] == 'o' && str[i] == 'u');
            count++;
          }
          System.out.println("Count of vowels in " +name+ " is " +count); 

    } 
    
}
