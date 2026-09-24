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
        int la=longestSubarraySumEqualTarget(a,n,target);
        System.out.println(la);
    }
    public static int longestSubarraySumEqualTarget(int a[],int n,int target){
        int la=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        int pSum=0;
        for(int i=0;i<n;i++){
            pSum +=a[i];
            if(pSum==target){
                la=i+1;
            }
            else if(hm.containsKey(pSum-target)){
                int len=i-hm.get(pSum-target);
                la=Math.max(la,len);
            }
            if(!hm.containsKey(pSum)){
                hm.put(pSum,i);
            }
        }
        return la;
    }
}