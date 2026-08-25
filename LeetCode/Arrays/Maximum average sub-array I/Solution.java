class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        int s=0;
        double la=0;
        for(int i=0;i<k;i++){
            s +=nums[i];
        }
        // la=s/4;
        System.out.println(s);
        int t=s;
        for(int i=k;i<n;i++){
            t +=nums[i];
            t -=nums[i-k];
            System.out.println(t);
            s=Math.max(s,t);
            System.out.println(s);
        }
        System.out.println(s);
        la=(double)s/k;
        return la;
    }
}
