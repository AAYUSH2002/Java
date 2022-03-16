package Functions;

import java.util.*;
public class OddSum {
    public static void oddSum(int n){
        int sum=0;
        for(int i=1;i<=n;i=i+2){
          
            sum+=i;

        }
        System.out.println(sum);

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        oddSum(n);
        sc.close();  
    }
}
