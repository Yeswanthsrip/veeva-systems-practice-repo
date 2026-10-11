class Solution {
    public int findMinDiff(int arr[], int m) {
        Arrays.sort(arr);
        int la=Integer.MAX_VALUE;
        int l=0;
        int r=m-1;
        while(r<arr.length){
            la=Math.min(la,(arr[r]-arr[l]));
            l++;
            r++;
        }
        return la;
    }
}