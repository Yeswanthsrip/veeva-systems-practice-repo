import java.util.*;
class Main {
    static int firstRepeatingChar(int arr[]){
        HashSet<Integer> hs=new HashSet<>();
        for(int x:arr){
            if(hs.contains(x)){
                return x;
            }
            hs.add(x);
        }
        return -1;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            
        }
        System.out.println("First repeated character is : "+firstRepeatingChar(arr));
    }
}