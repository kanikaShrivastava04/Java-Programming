import java.util.Scanner;

public class Ex4 {
   // Problem: Given a number x, the task is to print the numbers from x to 0 in decreasing order in a single line. 
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        // Your Code Here 
        int x = sc.nextInt(); 
         
         while(x>=0){
             System.out.print(x+" ");
             x--;
   }
   }
}
