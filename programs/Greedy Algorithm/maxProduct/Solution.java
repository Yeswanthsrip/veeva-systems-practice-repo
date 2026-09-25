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
        System.out.println(highestProduct(a,n));
    }
    public static int highestProduct(int a[],int n){
        Arrays.sort(a);
        int la1=a[n-1]*a[n-2]*a[n-3];
        int la2=a[0]*a[1]*a[n-1];
        return Math.max(la1,la2);
    }
}