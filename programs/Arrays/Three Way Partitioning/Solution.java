class Solution {
    public void threeWayPartition(int arr[], int a, int b) {
        ArrayList<Integer> al1=new ArrayList<>();
        ArrayList<Integer> al2=new ArrayList<>();
        ArrayList<Integer> al3=new ArrayList<>();
        for(int x:arr){
            if(x<a)
                al1.add(x);
            else if(x>b)
                al3.add(x);
            else
                al2.add(x);
        }
        int i=0;
        for(int x:al1){
            arr[i++]=x;
        }
        for(int x:al2){
            arr[i++]=x;
        }
        for(int x:al3){
            arr[i++]=x;
        }
    }
}