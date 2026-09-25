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
        System.out.println(minOperations(a,n));
    }
    public static int minOperations(int a[],int n){
        Arrays.sort(a);
        int mid=n/2;
        // System.out.println(mid);
        if(n%2==0){
            int la=0;
            int i=0,j=n-1;
            while(i<j){
                la +=Math.abs(a[i++]-a[mid]);
                la +=Math.abs(a[j--]-a[mid]);
                // System.out.println(la);
            }
            int la2=0;
            mid--;
            i=0;
            j=n-1;
            while(i<j){
                la2 +=Math.abs(a[i++]-a[mid]);
                la2 +=Math.abs(a[j--]-a[mid]);
            }
            System.out.println(la);
            System.out.println(la2);
            return Math.min(la,la2);
        }
        int la=0;
        int i=0,j=n-1;
        while(i<j){
            la +=Math.abs(a[i++]-a[mid]);
            la +=Math.abs(a[j--]-a[mid]);
        }
        return la;
    }
}