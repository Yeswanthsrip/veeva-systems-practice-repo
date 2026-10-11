class Solution {
    static void relativeSort(int[] a1, int[] a2) {
        int n1=a1.length;
        int n2=a2.length;
        LinkedHashMap<Integer,Integer> lhm=new LinkedHashMap<>();
        int la[]=new int[n1];
        for(int x:a1){
            lhm.put(x,lhm.getOrDefault(x,0)+1);
        }
        // System.out.println(lhm);
        HashSet<Integer> hs=new HashSet<>();
        int k=0;
        for(int x:a2){
            if(!hs.contains(x)){
                if(lhm.containsKey(x)){
                    int v=lhm.get(x);
                    for(int i=0;i<v;i++){
                        la[k++]=x;
                    }
                }
            }
            hs.add(x);
        }
        TreeMap<Integer,Integer> tm=new TreeMap<>();
        for(int x:a1){
            if(!hs.contains(x)){
                tm.put(x,tm.getOrDefault(x,0)+1);
            }
        }
        Set<Integer> s1=tm.keySet();
        for(int x:s1){
            for(int i=0;i<tm.get(x);i++){
                la[k++]=x;
            }
        }
        k=0;
        for(int x:la){
            a1[k++]=x;
        }
    }
}