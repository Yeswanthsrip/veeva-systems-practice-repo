class Solution {
    public int minCandy(int r[]) {
        int n=r.length;
        int a[]=new int[n];
        int la=0;
        Arrays.fill(a,1);
        for(int i=1;i<n;i++){
            if(r[i]>r[i-1]){
                a[i]=Math.max(a[i],a[i-1]+1);
            }
        }
        // for(int i=0;i<n;i++){
        //     System.out.print(a[i]+" ");
        // }
        // System.out.println();
        for(int i=n-2;i>=0;i--){
            if(r[i]>r[i+1]){
                a[i]=Math.max(a[i],a[i+1]+1);
            }
        }
        // for(int i=0;i<n;i++){
        //     System.out.print(a[i]+" ");
        // }
        // System.out.println();
        for(int i=0;i<n;i++){
            la +=a[i];
        }
        return la;
    }
}