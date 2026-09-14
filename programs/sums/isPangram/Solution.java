import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//String s1=sc.next();
		//String s2=sc.next();
		//System.out.println(isPangram(s1,s2));
		isPangram();
	}
	public static void isPangram(){
	    int n = 10;
		int count = Integer.bitCount(n);
		System.out.println(count);
	}
}
