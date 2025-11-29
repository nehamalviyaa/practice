//get the unicode point before index .
import java.util.Scanner;
public class q17 {



    public static int getUnicodeBeforeIndex (String text, int n){

        if(text == null || n < 0 || n >= text.length()){
            throw new IllegalArgumentException("Invalid String or index");

        }
        
        return text.codePointBefore(n);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String text = sc.next();
         
        System.out.println("Enter the index");
        int n = sc.nextInt();

     int  unicode = getUnicodeBeforeIndex(text,n);

        
        System.out.println("Unicode at Before index : "+n+" is "+unicode);


    }
    
}
