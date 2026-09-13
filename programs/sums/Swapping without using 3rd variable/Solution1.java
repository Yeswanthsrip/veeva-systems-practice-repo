import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value : ");
        int a=sc.nextInt();
		System.out.println("Enter b value : ");
		int b=sc.nextInt();
		System.out.println("Before swapping "+"\n"+"a : "+a+"\n"+"b : "+b);
		b=(a+b)-(a=b);
		System.out.println("After swapping "+"\n"+"a : "+a+"\n"+"b : "+b);
    }
}