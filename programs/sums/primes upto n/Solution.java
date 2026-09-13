import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n value : ");
        int n=sc.nextInt();
        ArrayList<Integer> la=primesUptoN(n);
        System.out.println("Primes upto n are : "+"\n"+la);
    }
    static ArrayList<Integer> primesUptoN(int n){
        ArrayList<Integer> la=new ArrayList<>();
        boolean p[]=new boolean[n+1];
        Arrays.fill(p,true);
        p[0]=p[1]=false;
        for(int i=2;i*i<=n;i++){
            if(p[i]){
                for(int j=i*i;j<=n;j=j+i){
                    p[j]=false;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(p[i])
                la.add(i);
        }
        return la;
    }
}