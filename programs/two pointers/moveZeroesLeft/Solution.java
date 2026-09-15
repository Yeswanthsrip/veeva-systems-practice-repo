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
        int i=0;
        int j=1;
        while(j<n){
            if(a[i]==0 && a[j]==0){
                i +=2;
                j +=2;
            }
            else if(a[i]==0){
                i++;
                j++;
            }
            else if(a[j]==0){
                if(j-i==1){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                    i++;
                    j++;
                }
                else{
                    int temp=a[j-1];
                    a[j-1]=a[j];
                    a[j]=temp;
                    j--;
                }
            }
            else{
                j++;
            }
        }
    }
}