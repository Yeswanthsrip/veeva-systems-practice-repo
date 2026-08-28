import java.util.*;
class Main {
    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int md=999;
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            if(Math.abs(arr[i]-arr[i+1])<md){
                md=Math.abs(arr[i]-arr[i+1]);
            }
        }
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.println(md);
        List<List<Integer>> la=new ArrayList<>();
        for(int i=0;i<n-1;i++){
            if(Math.abs(arr[i]-arr[i+1])==md){
                List<Integer> t=new ArrayList<>();
                t.add(arr[i]);
                t.add(arr[i+1]);
                la.add(t);
            }
        }
        return la;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(minimumAbsDifference(arr));
    }
}