import java.util.*;

public class Average{
    public static void calAverage(int a,int b,int c){
        System.out.println((a+b+c)/3);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        calAverage(a,b,c);
        sc.close();
    }
} 
