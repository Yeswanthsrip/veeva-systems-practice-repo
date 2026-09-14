import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string1 : ");
        String s1=sc.next();
        System.out.println("Enter string2 : ");
        String s2=sc.next();
        System.out.println(isAnagram(s1,s2));
    }
    static boolean isAnagram(String s1,String s2){
        int ch[]=new int[26];
        char ch1[]=s1.toCharArray();
        char ch2[]=s2.toCharArray();
        for(char c:ch1){
            ch[c-'a']++;
        }
        for(char c:ch2){
            ch[c-'a']--;
        }
        for(int i=0;i<26;i++){
            if(ch[i]!=0)
                return false;
        }
        return true;
    }
}