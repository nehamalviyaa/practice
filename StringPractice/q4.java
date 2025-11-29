/*WAP to find out total occurrence of each letter in string.
	 Sample Input: “aabbccddd”
	 Output:   a- 2 times
			b- 2 times
			c- 2 times
			d- 3 times*/
import java.util.Scanner;
class q4{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);

System.out.println("enter string");
String input  = sc.nextLine();
 
 int count = 0;
 char [] word = input.toCharArray();

 for(int i=0 ; i < word.length; i++){
    for(int j = i+1; j < word.length;j++){
    if(word[i] == word[j]){
        count++;
    }
    else{
        break;
    }
 }
 
 }

 System.out.println(count +" times");


}    
}            

