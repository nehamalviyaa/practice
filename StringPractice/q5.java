//WAP check if two Strings are anagrams of each other?
//(Hint Anagram words: LISTEN - SILENT 
//				  TRIANGLE - INTEGRAL)

import java.util.Scanner;
public class q5 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first String");
        String str = sc.next();
        System.out.println("enter the second string");
        String str2 = sc.next();

          char[] first = str.toCharArray();
          char[] second = str2.toCharArray();
          
          for(int i=0; i<first.length;i++){
            for(int j=i+1; j<first.length;j++){
               
              
            }
          }

    }
    
}
