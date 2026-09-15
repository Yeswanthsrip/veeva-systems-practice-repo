import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        System.out.println(isTwoSum(a,n,target));
    }
    static boolean isTwoSum(int a[],int n,int target){
        Arrays.sort(a);
        int i=0;
        int j=n-1;
        while(i<j){
            int t=a[i]+a[j];
            if(t==target)
                return true;
            else if(t>target)
                j--;
            else
                i++;
        }
        return false;
    }
}