
import java.util.*;

class Main {
    public static void checkVote(int age){
        if(age>18)
         System.out.println("Eligible");
        else
          System.out.println("Not Eligible");
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age=sc.nextInt();
        checkVote(age);
        sc.close();
    }
}
4