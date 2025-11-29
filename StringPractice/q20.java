// Find the total occurence of given character.
// input s ="Programming" , char = 'm' .
// output 2.
import java.util.Scanner;
public class q20 {

   public static int characterCount(String text, char target){
   
     int count = 0;

     for(int i = 0; i < text.length(); i++){
        if(text.charAt(i) == target){
                count++;
        }
     }
 return count;

   }

    public static void main(String [ ] args){
     
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the String");
      String text = sc.next();

      System.out.println("Enter the Character");
      char target = sc.next().charAt(0);

      int result = characterCount(text, target);

        System.out.println("The Ocuurence of "+target+ " : "+result);
    }
    
}
