//Get the character at the given index .(S= "Python , index = 2 output:t").

import java.util.Scanner;
public class q15 {


    public static void getCharacter(String str , int n){
      
        char [] word = str.toCharArray();
        for(int i=0; i<word.length; i++){
            if(i == n){
                System.out.println("The character at "+i+ "index : "+word[i]);
                break;
            }
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the String");
        String str = sc.next();

        System.out.println("Enter the Index Number");
        int n = sc.nextInt();

        getCharacter(str,n);
    }
    
}
