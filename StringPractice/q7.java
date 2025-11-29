//concanate two strings s1="Hello" s2="World" "HelloWorld"
import java.util.Scanner;
public class q7 {

public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("enter first string");
    String str = sc.next();

    System.out.println("enter second string");
    String strr = sc.next();


    String result = str + strr;
    System.out.println("Result : "+result);

}

    
}
