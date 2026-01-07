import java.util.Scanner;

public class Ex7 {
    public static void main(String args[]){
        //Given a natural number n. You have to find the number of digits in it and return it
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        // Your Code Here
        int counter = 0; 
        while(n!=0){ 
            counter++; 
            n = n/10; 
           

        } 
         System.out.print(counter); 
    }
}
