package Functions;

import java.util.*;

public class Factorial{
        public static void calculateFactorial(int n){
            int fact=1;
            if(n<0){
                 System.out.println("Invalid Number");
                 return;
            }

            

            for(int i=n;i>0;i--){
             fact=fact*i;
            }
            System.out.println("Factorial = " + fact);
        

        }

        public static void main(String[] arg){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            calculateFactorial(n);
            sc.close();
        }

}