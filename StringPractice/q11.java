//Convert a string to lowercase.
import java.util.Scanner;
public class q11 {
     
   public static void lowercaseString(String word){
         char [] newWord = word.toCharArray();

         
         for(int i=0; i<newWord.length; i++){
           if(newWord[i]>'A' && newWord[i]<'Z'){
                newWord[i]  = (char)(newWord[i] + 32 );
           } 
         }

         String result = new String(newWord);
         System.out.println(result);
   }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the string");
        String word = sc.next();

        lowercaseString(word);
    } 


}
