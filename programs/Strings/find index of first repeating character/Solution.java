import java.util.*;
class Main{
    static int indexOfFirstRepeatingChar(String s){
        if(s.length()<2){
            return -1;
        }
        HashMap<Character,ArrayList<Integer>> hm=new HashMap<>();
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(hm.containsKey(ch[i])){
                ArrayList<Integer> t=hm.get(ch[i]);
                t.add(i);
                hm.put(ch[i],t);
            }
            else{
                ArrayList<Integer> t=new ArrayList<>();
                t.add(i);
                hm.put(ch[i],t);
            }
        }
        System.out.println(hm);
        int la=Integer.MAX_VALUE;
        Set<Character> set=hm.keySet();
        for(char c:set){
            ArrayList<Integer> t=hm.get(c);
            if(t.size()>1){
                for(int te:t){
                    la=Math.min(la,te);
                }
            }
        }
        return (la==Integer.MAX_VALUE)?-1:la;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(indexOfFirstRepeatingChar(s));
    }
}