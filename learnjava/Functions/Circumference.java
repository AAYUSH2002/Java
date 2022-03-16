package Functions;

import java.util.*;

public class Circumference {
    public static void calCircumference(int r){
        System.out.println(2*3.14*r);
    }

    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int r = sc.nextInt();
        calCircumference(r);
    }
    
}
