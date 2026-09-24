import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(lenLongestSubString(s));
    }
    public static int lenLongestSubString(String s){
        int la=0;
        char ch[]=s.toCharArray();
        int n=s.length();
        LinkedHashSet<Character> hs=new LinkedHashSet<>();
        for(int i=0;i<n;i++){
            // boolean b[]=new boolean[26];
            for(int j=i;j<n;j++){
                // if(b[ch[j]-'a']){
                //     break;
                // }
                // b[ch[j]-'a']=true;
                if(hs.contains(ch[j])){
                    break;
                }
                hs.add(ch[j]);
                la=Math.max(la,hs.size());
            }
            System.out.println(hs);
            hs.clear();
        }
        return la;
    }
}