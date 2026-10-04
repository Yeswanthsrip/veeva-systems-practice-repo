class Solution {
    public int minPlatform(int arr[], int dep[]) {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int n=arr.length;
        int la=1;
        int c=1;
        int i=1;
        int j=0;
        while(i<n && j<n){
            if(arr[i]<=dep[j]){
                c++;
                // la=Math.max(la,c);
                i++;
            }
            else{
                c--;
                j++;
            }
            la=Math.max(la,c);
        }
        return la;
    }
}