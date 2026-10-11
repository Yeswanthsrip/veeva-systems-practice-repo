class Solution {
    public void threeWayPartition(int arr[], int a, int b) {
        LinkedList<Integer> ll=new LinkedList<>();
        int i=0;
        for(int x:arr){
            if(x<a){
                ll.addFirst(x);
                i++;
            }
            else if(x>b){
                ll.addLast(x);
            }
            else{
                ll.add(i,x);
                i++;
            }
        }
        Iterator it=ll.iterator();
        i=0;
        while(it.hasNext()){
            arr[i++]=(int)it.next();
        }
    }
}