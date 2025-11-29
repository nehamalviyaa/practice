 //Input data exactly in the following format, and print sum of all integer values.
	
//Sample Input: “67, 89, 23, 67, 12, 55, 66”. (Hint use String class split method and Integer class parseInt method)

import java.util.Scanner;
public class q3 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.next();
       
        String [] num = str.split(",");
          
        int sum = 0;
        for(String number :num){
        sum +=  Integer.parseInt(number.trim());
        }

        System.out.println("The Sum of NumericString : "+sum);
        

           

     }
   }
    

