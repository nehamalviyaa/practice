 //WAP to count the word whose first letter is  vowel.
 import java.util.Scanner;

public class q1 {
  
    public static void main(String [ ] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.next();
        
          String [] words = str.split("\\st+");
  
          int count = 0;
          for(String word :words){
             if(word.length() > 0){
             char firstchar = Character.toLowerCase(word.charAt(0)); 

             if(firstchar == 'a' || firstchar == 'e' || firstchar == 'i' || firstchar == 'o' || firstchar == 'u'){
                count ++;
             }
             }       
          }

          System.out.println("Number count of word starts with vowel : "+count);
        
    }
    
}
