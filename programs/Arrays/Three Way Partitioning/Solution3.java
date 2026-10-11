class Solution {
    public void threeWayPartition(int arr[], int a, int b) {
        int i=0,j=0,k=arr.length-1;
        while(j<=k){
            if(arr[j]<a){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j++;
            }
            else if(arr[j]>b){
                int temp=arr[j];
                arr[j]=arr[k];
                arr[k]=temp;
                k--;
            }
            else{
                j++;
            }
        }
    }
}