import java.util.*;                                                                                                 
public class Ex6 {
    //While loop is another loop like for loop but unlike for loop it only checks for one condition.
//Here, we will use a while loop and print a number n's table in reverse order. 
 public static void main(String []args){ 
    Scanner sc = new Scanner(System.in); 
    int n = sc.nextInt();
    int i=10; 
        while(i>=1) {
          System.out.print(i*n+" ");
          i--;
        }
 }

 
}
