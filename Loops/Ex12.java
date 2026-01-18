import java.util.Scanner;

public class Ex12 {
    
    public static void main(String args[]){
       // Given an integer n check if n is prime or not.
//A prime number is a number that is divisible by 1 and itself only. 

 Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         
         int count = 0;  
         for(int i=1;i<=n;i++){
              if(n%i == 0){
             count++;
         } 
         }
        
         
         if(count==2){
             System.out.print("True");
         }else{
             System.out.println("False");
         }
    }
}
