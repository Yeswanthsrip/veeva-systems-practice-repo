import java.util.*;
class Main{
    static Character findCharNotRepeatInString(String s){
        LinkedHashMap<Character,Integer> lhm=new LinkedHashMap<>();
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(lhm.containsKey(ch[i])){
                lhm.put(ch[i],91);
            }
            else{
                lhm.put(ch[i],1);
            }
        }
        Set<Character> set=lhm.keySet();
        for(char c:set){
            if(lhm.get(c)==1){
                return c;
            }
        }
        return '0';
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(findCharNotRepeatInString(s));
    }
}