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
        System.out.println("Enter threshold");
        int t=sc.nextInt();
        System.out.println(minOperations(a,t));
    }
    public static int minOperations(int a[],int t){
        Arrays.sort(a);
        int la=0;
        int s=0;
        for(int x:a){
            if(s+x>t)
                break;
            s +=x;
            la++;
        }
        return la;
    }
}