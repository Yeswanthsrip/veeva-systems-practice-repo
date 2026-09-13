import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
		Main m=new Main();
        int n=sc.nextInt();
        System.out.println("No.of trailing zeroes are : "+m.noOfTrailingZeroes(n));
    }
	int noOfTrailingZeroes(int n){
		int la=0;
		for(int i=5;i<=n;i=i*5){
			la +=n/i;
		}
		return la;
	}
}