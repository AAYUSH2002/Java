package Functions;

import java.util.*;

public class Greatest {
    public static void calGreatest(int a,int b){
      if(a>b)
      System.out.println(a);
      else
      System.out.println(b);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        calGreatest(a,b);
        sc.close();
    }
}
