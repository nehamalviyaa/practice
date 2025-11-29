//find the first occurence of the given character in string and return its index number.
// input s ="banana" , char ="a" output index = 1.
import java.util.Scanner;
public class q18 {

    public static void getIndex(String text , String ch){
        
        char [] word = text.toCharArray();
        char target = ch.charAt(0);

        if(!text.contains(ch)){
                System.out.println("Please, enter the valid character ");
                return;
            }

        for(int i = 0 ; i<word.length; i++){
          
            if(word[i] == target){
                System.out.println("The index number of "+target+" : "+i);
                break;
            }
        }
       


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String");
        String text = sc.next();

        System.out.println("Enter the character ");
        String ch = sc.next();

        getIndex(text, ch);

    }
    
}
