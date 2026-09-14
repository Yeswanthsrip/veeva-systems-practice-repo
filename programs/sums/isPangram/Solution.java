import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(isPangram(s));
	}
	public static boolean isPangram(String s){
	    int p[]=new int[26];
	    char ch[]=s.toCharArray();
	    for(int c:ch){
	        if(Character.isLetter(c)){
				c=Character.toLowerCase(c);
	            p[c-'a']++;
	        }
	    }
	    int la=0;
	    for(int x:p){
	        if(x!=0)
	            la++;
	    }
	    return (la==26)?true:false;
	}
}
