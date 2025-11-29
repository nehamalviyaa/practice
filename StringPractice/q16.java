// get the unicode of chracter of the given index
import java.util.Scanner;
public class q16 {



    public static int getUnicode(String text, int n){

        if(text == null || n < 0 || n >= text.length()){
            throw new IllegalArgumentException("Invalid String or index");

        }
        
        return text.codePointAt(n);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String text = sc.next();
         
        System.out.println("Enter the index");
        int n = sc.nextInt();

     int  unicode = getUnicode(text,n);

        System.out.println("Character at given index : "+n+ " = "+text.charAt(n));
        System.out.println("Unicode at index : "+n+" is "+unicode);


    }
    
}
