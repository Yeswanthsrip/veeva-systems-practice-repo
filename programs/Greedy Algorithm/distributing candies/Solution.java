import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r[]=new int[n];
        for(int i=0;i<n;i++){
            r[i]=sc.nextInt();
        }
        System.out.println(minCandies(r,n));
    }
    static int minCandies(int r[],int n){
        int a[]=new int[n];
        int la=0;
        Arrays.fill(a,1);
        for(int i=1;i<n;i++){
            if(r[i]>r[i-1]){
                a[i]=Math.max(a[i],a[i-1]+1);
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        for(int i=n-2;i>=0;i--){
            if(r[i]>r[i+1]){
                a[i]=Math.max(a[i],a[i+1]+1);
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        for(int i=0;i<n;i++){
            la +=a[i];
        }
        return la;
    }
}