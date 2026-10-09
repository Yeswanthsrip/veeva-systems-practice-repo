class Solution {
    public int countSubstring(String s) {
        // HashMap<Character,Integer> hm=new HashMap<>();
        int a[]=new int[26];
        char c[]=s.toCharArray();
        int la=0;
        for(char x:c){
            a[x-'a']++;
            la +=a[x-'a'];
            // hm.put(x,hm.getOrDefault(x,0)+1);
        }
        // int la=ch.length;
        // for(Map.Entry<Character,Integer> e: hm.entrySet()){
        //     Integer v=e.getValue();
        //     la +=(v>1)?v-1:0;
        // }
        
        return la;
    }
}