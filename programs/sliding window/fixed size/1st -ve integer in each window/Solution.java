//Slinding Window Deque

import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int la[]=firstNegativeNumber(a,n,k);
        for(int i=0;i<la.length;i++){
            System.out.print(la[i]+" ");
        }
        System.out.println();
    }
    public static int[] firstNegativeNumber(int a[],int n,int k){
        int la[]=new int[n-k+1];
        Deque<Integer> dq=new LinkedList<>();
        for(int i=0;i<k;i++){
            if(a[i]<0){
                dq.add(i);
            }
        }
        if(dq.isEmpty())
            la[0]=0;
        else{
            la[0]=a[dq.peekFirst()];
			//dq.pollFirst();
		}
		System.out.println(dq);
        for(int i=k;i<n;i++){
            while(!dq.isEmpty() && (dq.peekFirst()<=i-k)){
                dq.removeFirst();
            }
            // t=0;
            if(a[i]<0){
                dq.addLast(i);
            }
            if(!dq.isEmpty()){
                la[i-k+1]=a[dq.peekFirst()];
				//dq.pollFirst();
            }
            else
                la[i-k+1]=0;
			System.out.println(dq);
        }
        return la;
    }
}