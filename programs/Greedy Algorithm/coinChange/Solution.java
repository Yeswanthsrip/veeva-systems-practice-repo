import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter v value ");
        int v=sc.nextInt();
        System.out.println(coinChange(v));
    }
    public static int coinChange(int v){
        int c[]={1,2,5,10,20,50,100,200,500,2000};
        int la=0;
        for(int i=9;i>=0;i--){
            int t=v/c[i];
            la +=t;
            v=v%c[i];
        }
        return la;
    }
}