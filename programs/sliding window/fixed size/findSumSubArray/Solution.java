import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n value : ");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the k value : ");
        int k=sc.nextInt();
        int la[]=findSumSubArray(n,a,k);
        for(int i=0;i<n-k+1;i++){
            System.out.print(la[i]+" ");
        }
        System.out.println();
    }
    static int[] findSumSubArray(int n,int a[],int k){
        int la[]=new int[n-k+1];
        int j=0;
        int s=a[0];
        for(int i=1;i<k;i++){
            s +=a[i];
        }
        la[j++]=s;
        for(int i=k;i<n;i++){
            s +=a[i];
            s -=a[i-k];
            la[j++]=s;
        }
        return la;
    }
}