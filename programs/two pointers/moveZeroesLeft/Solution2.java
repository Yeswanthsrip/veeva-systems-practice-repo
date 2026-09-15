import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        moveZeroesLeft(a,n);
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    static void moveZeroesLeft(int a[],int n){
        int i=n-1;
        int j=n-1;
        while(i>=0){
            if(a[i]!=0){
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				j--;
			}
			i--;
        }
    }
}