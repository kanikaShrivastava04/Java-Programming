import java.util.Scanner;

public class Ex11 {
    public static void main(String args[]){
//Given an integer n. Write a program to find the nth Fibonacci number.
// F(0)= 0, F(1)=1
// The nth Fibonacci number is given by the forumla F(n) = F(n-1) + F(n-2). The first few fibonacci numbers are: 0 1 1 2 3 5. . . . 

 Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int prev = 0; 
        int curr = 1; 
        int next = 0; 
        if(n == 0){
            System.out.print(prev);
        }
        else if(n==1){
            System.out.print(curr);
        }
        else{
             for(int i=2;i<=n;i++){
           next = prev+curr;
            
            
            prev = curr; 
            curr = next; 
            
        }
        System.out.println(next);
        }
       
    }
}
