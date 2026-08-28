import java.util.*;
class Main {
    static String extractPlainText(String s){
        char ch[]=s.toCharArray();
        ArrayList<String> al=new ArrayList<>();
        StringBuilder la=new StringBuilder();
        StringBuilder t=new StringBuilder();
        char a='0';
        for(char c:ch){
            if(c=='<'){
                a='0';
                la.append(t);
                t.setLength(0);
            }
            else if(c=='>'){
                a='>';
            }
            else{
                if(a=='>')
                    t.append(c);
            }
            // System.out.println(la);
            // System.out.println(t);
            // System.out.println(a);
        }
        return la.toString();
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(extractPlainText(s));
    }
}