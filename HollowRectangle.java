public class HollowRectangle {
    public static void main(String[] args){
    int n=4;
    int m=5;
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
          if( i==0 || i==3 || j==0 ||j==4)
          System.out.print("*");
          else 
          System.out.print(" ");
        }
        System.out.println();

    }
    
}
}
