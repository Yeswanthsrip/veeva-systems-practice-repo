import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value ");
        int n=sc.nextInt();
        System.out.println("Enter elements of a");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter elements of b");
        int b[]=new int[n];
        for(int i=0;i<n;i++){
            b[i]=sc.nextInt();
        }
        System.out.println(minOperations(a,b,n));
    }
    public static int minOperations(int a[],int b[],int n){
        Arrays.sort(a);
        Arrays.sort(b);
        int la=0;
        for(int i=0;i<n;i++){
            la +=Math.abs(a[i]-b[i]);
        }
        return la;
    }
}