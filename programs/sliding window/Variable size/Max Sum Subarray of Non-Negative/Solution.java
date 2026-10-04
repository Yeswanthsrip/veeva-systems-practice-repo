class Solution {
    public ArrayList<Integer> findSubarray(int arr[]) {
        int n=arr.length;
        int l=0,r=0;
        int pSum=0,sum=0;
        int pl=0,pr=0;
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                r++;
                sum +=arr[i];
            }
            else{
                if(sum>pSum){
                    pSum=sum;
                    pl=l;
                    pr=r;
                }
                else if(sum==pSum){
                    if((r-l+1)>(pr-pl+1)){
                        pr=r;
                        pl=l;
                    }
                }
                sum=0;
                r++;
                l=r;
            }
        }
        if(sum>pSum){
            pSum=sum;
            pl=l;
            pr=r;
        }
        ArrayList<Integer> la=new ArrayList<>();
        for(int i=pl;i<pr;i++){
            la.add(arr[i]);
        }
        if(la.isEmpty()){
            la.add(-1);
        }
        return la;
    }
}