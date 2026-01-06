import java.util.*;
public class Ex3 {
    // You are given a string s, you need to print its characters
    //  at even indices (index starts at 0). 

    public static void main(String args[]){ 
        Scanner sc = new Scanner(System.in);
        String S = sc.next(); 

        for(int i=0;i<S.length();i++){ 
            if(i%2 == 0){
                System.out.print(S.charAt(i));
             }
            
        }

    }


}
