//find the last occurence of given character input : S ="banana" ch = 'a' output index 5
import java.util.Scanner;
public class q19 {
     public static void getIndex(String text , String ch){
        
        char [] word = text.toCharArray();
        char target = ch.charAt(0);

        if(!text.contains(ch)){
                System.out.println("Please, enter the valid character ");
                return;
            }

        for(int i = word.length - 1; i >= 0; i--){
          
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
