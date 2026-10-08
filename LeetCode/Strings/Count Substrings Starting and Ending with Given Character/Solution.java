class Solution {
    public long countSubstrings(String s, char c) {
        long la=0;
        char ch[]=s.toCharArray();
        int ct=0;
        for(char x:ch){
            if(x==c){
                ct++;
                la +=ct;
            }
        }
        return la;
    }
}