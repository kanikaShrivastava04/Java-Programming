import java.util.Scanner;

public class Ex8 {
     
    public static void main(String args[]){
        //Given two number n1 and n2, n1 > n2. Find the differences between mathematical tables of n1 and n2 and print in a single line. 
         Scanner sc = new Scanner(System.in); 
        int n1 = sc.nextInt(); 
        int n2 = sc.nextInt(); 
        
       for(int i=1 ; i<=10;i++){
           int diff = (n1*i)-(n2*i);
           System.out.print(diff +" ");
       }
    }
}
