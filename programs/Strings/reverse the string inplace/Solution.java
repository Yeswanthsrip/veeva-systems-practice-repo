import java.util.*;
class Main{
    static StringBuilder reverseStringInplace(StringBuilder sb){
        // char ch[]=sb.toCharArray();
        char ch[]=new char[sb.length()];
        for(int i=0;i<sb.length();i++){
            ch[i]=sb.charAt(i);
        }
        // for(int i=0;i<ch.length;i++){
        //     System.out.print(ch[i]+" ");
        // }
        // System.out.println();
        // System.out.println(sb);
        sb.setLength(0);
        for(int i=ch.length-1;i>=0;i--){
            // System.out.println(i);
            // System.out.println(ch[i]);
            sb.append(String.valueOf(ch[i]));
        }
        // System.out.println(sb);
        return sb;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder(sc.next());
        System.out.println(reverseStringInplace(sb));
    }
}