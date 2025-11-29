//convert a string  to uppercase
import java.util.Scanner;
public class q10 {
     
   public static void uppercaseString(String word){
         char [] newWord = word.toCharArray();

         
         for(int i=0; i<newWord.length; i++){
           if(newWord[i]>'a' && newWord[i]<'z'){
                newWord[i]  = (char)(newWord[i] - 32 );
           } 
         }

         String result = new String(newWord);
         System.out.println(result);

 


   }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the string");
        String word = sc.next();

        uppercaseString(word);



    } 


}
