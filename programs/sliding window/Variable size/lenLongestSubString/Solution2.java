import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(lenLongestSubString(s));
    }
    public static int lenLongestSubString(String s){
        int la=0,l=0,r=0;
        int n=s.length();
        char ch[]=s.toCharArray();
        LinkedHashSet<Character> lhs=new LinkedHashSet<>();
        for(int i=0;i<n;i++){
            if(!lhs.contains(ch[i])){
                lhs.add(ch[i]);
                l++;
                la=Math.max(la,l);
            }
            else{
                while(lhs.contains(ch[i])){
                    lhs.remove(ch[r]);
                    r++;
                    l--;
                }
                lhs.add(ch[i]);
                l++;
                la=Math.max(la,l);
            }
        }
        return la;
    }
}