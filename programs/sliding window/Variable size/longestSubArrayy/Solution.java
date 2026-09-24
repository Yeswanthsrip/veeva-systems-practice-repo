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
        ArrayList<Integer> la=longestSubArraySumEqualTarget(a,n,target);
        System.out.println(la);
    }
    public static ArrayList<Integer> longestSubArraySumEqualTarget(int a[],int n,int target){
        int la=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        int pSum=0;
        int l=0,r=0;
        for(int i=0;i<n;i++){
            pSum +=a[i];
            if(pSum==target){
                la=i+1;
                l=0;
                r=la;
            }
            else if(hm.containsKey(pSum-target)){
                int len=i-hm.get(pSum-target);
                if(len>la){
                    la=len;
                    l=hm.get(pSum-target)+1;
                    r=i+1;
                }
                // la=Math.max(la,len);
            }
            if(!hm.containsKey(pSum)){
                hm.put(pSum,i);
            }
        }
        ArrayList<Integer> la2=new ArrayList<>();
        for(int i=l;i<r;i++){
            la2.add(a[i]);
        }
        return la2;
    }
}