class Solution {
    public int smallestSubstring(String s) {
        int n=s.length();
        HashMap<Integer,Integer> hm=new HashMap<>();
        char ch[]=s.toCharArray();
        int l=0,la=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int k=ch[i]-'0';
            if(!hm.containsKey(k)){
                hm.put(k,1);
            }
            else{
                hm.put(k,hm.get(k)+1);
            }
            while(hm.size()==3){
                la=Math.min(la,i-l+1);
                int t=ch[l]-'0';
                hm.put(t,hm.get(t)-1);
                if(hm.get(t)==0)
                    hm.remove(t);
                l++;
            }
                // System.out.println(hm);
                // System.out.println("l "+l+" la "+la);
        }
        // System.out.println(hm);
        return la==Integer.MAX_VALUE?-1:la;
    }
}