//check whether the string is empty or not 

import java.util.Scanner;
public class q13 {

    public static void checkEmpty(String str){

       if(str.isEmpty()){
      System.out.println("True");
       }
       else{
        System.out.println("False");
       }  
    }

    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);   
    System.out.println("Enter the string ");
    String str = sc.next();

    checkEmpty(str);   

    }    
}
