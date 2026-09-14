import java.util.*;
class Sort implements Comparator<ArrayList<Integer>>{
    public int compare(ArrayList<Integer> al1,ArrayList<Integer> al2){
        if(al2.get(0)>al1.get(0)){
            return 1;
        }
        else if(al2.get(0)==al1.get(0)){
            return 0;
        }
        else
            return -1;
    }
}
class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int a[]=new int[n];
	    for(int i=0;i<n;i++){
	        a[i]=sc.nextInt();
	    }
	    sortArrByDecFreq(a,n);
	}
	static void sortArrByDecFreq(int a[],int n){
	    HashMap<Integer,Integer> hm=new HashMap<>();
	    for(int i=0;i<n;i++){
	        hm.put(a[i],hm.getOrDefault(a[i],0)+1);
	    }
	    System.out.println(hm);
	    ArrayList<ArrayList<Integer>> f=new ArrayList<>();
	    for(Map.Entry<Integer,Integer> e:hm.entrySet()){
	        ArrayList<Integer> t=new ArrayList<>();
	        t.add(e.getValue());
	        t.add(e.getKey());
	        f.add(t);
	    }
	    System.out.println(f);
	    Collections.sort(f,new Sort());
	    System.out.println(f);
	    ArrayList<Integer> la=new ArrayList<>();
	    for(int i=0;i<f.size();i++){
	        for(int j=0;j<f.get(i).get(0);j++){
	            la.add(f.get(i).get(1));
	        }
	    }
	    System.out.println(la);
	}
}
