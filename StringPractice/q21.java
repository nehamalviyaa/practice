
// Remove Occurence of the character in String .
//Input :  S = "banana", Char = 'a', Remove All.
// Output: bnn.
import java.util.Scanner;
public class q21 {
     
    public static void charRemove(String text, char target){
         
       char[] word = text.toCharArray();

        for(int i=0; i<word.length; i++){
        for(int j=0; j<word.length; j++){

         if( target != word[i]){
              System.out.println(word[i]);

         }
        } 

        }

    }

    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the String"); 
    String text = sc.nextLine(); 
    
    System.out.println("Enter the Character");
    char target = sc.next().charAt(0);
        

     charRemove(text,target);

    }
    
}
