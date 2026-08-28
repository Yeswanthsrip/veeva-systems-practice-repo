import java.util.*;
class Main {
    static boolean isPangram(String s){
        boolean a[]=new boolean[26];
        char ch[]=s.toCharArray();
        for(char c:ch){
            if(Character.isLetter(c)){
                char t=Character.toLowerCase(c);
                a[t-'a']=true;
                // System.out.println(c);
            }
        }
        int la=0;
        for(int i=0;i<26;i++){
            if(a[i])
                la++;
        }
        return (la==26)?true:false;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(isPangram(s));
        // System.out.println('T'-'a');
    }
}