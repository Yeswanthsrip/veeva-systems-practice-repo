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
        HashSet<Integer> hs=new HashSet<>();
        for(int x:a){
            if(hs.contains(target-x))
                return true;
            hs.add(x);
        }
        return false;
    }
}