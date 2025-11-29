//toggle the case of each character
import java.util.Scanner;
public class q12 {


    public static void toggle(String str){
      
     char[] word =  str.toCharArray();
       

     for(int i =0 ; i<word.length; i++){
        if(word[i] >= 'A' && word[i] <= 'Z'){
            word[i]  = (char)(word[i] + 32);
        }

        else if(word[i] >= 'a' && word[i] <= 'z'){
            word[i]  = (char)(word[i] - 32);
         }
     }

      String result = new String(word);
      System.out.println(" After Toggle of each character "+str+ ": " +result);
    
    
    }
    public static void main(String [] args){
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter the String");
     String str = sc.next(); 

     toggle(str);    

    }
}
    

