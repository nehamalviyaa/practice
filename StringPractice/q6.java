//Find the length of a string .For example programming (11).
import java.util.Scanner;

public class q6 {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.next();
        
      char[] word = str.toCharArray();
       

      int count =0;
      for(int i=0;i<word.length;i++){
       count++; 
      }
        word.toString();
      System.out.println("The length of String"+count);
    }
    
}
