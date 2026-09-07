import java.util.*;
class Car{
    String model;
    int price;
    Car(String model,int price){
        this.model=model;
        this.price=price;
    }
}
class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        HashMap<String,ArrayList<Car>> hm=new HashMap<>();
        while(true){
            System.out.println("Enter company name : ");
            String company=sc.next();
            System.out.println("Enter model name : ");
            String model=sc.next();
            System.out.println("Enter price : ");
            int price=sc.nextInt();
            Car c=new Car(model,price);
            if(hm.containsKey(company)){
                hm.get(company).add(c);
            }
            else{
                ArrayList<Car> t=new ArrayList<>();
                t.add(c);
                hm.put(company,t);
            }
            System.out.println("enter 0 to stop giving input");
            int t=sc.nextInt();
            if(t==0)
                break;
        }
        System.out.println(hm);
        Set<String> s=hm.keySet();
        ArrayList<String> al=new ArrayList<>();
        for(String x:s){
            System.out.println("***Company : "+x);
            String tm="";
            int tp=0;
            for(Car c:hm.get(x)){
                if(c.price>tp){
                    tp=c.price;
                    tm=c.model;
                }
                System.out.println("Model : "+c.model);
                System.out.println("Price : "+c.price);
            }
            al.add(tm);
        }
        System.out.println("-----------------------------------------");
        ArrayList<Integer> al2=new ArrayList<>();
        int i=0;
        for(String x:s){
            // System.out.println("***Company : "+x);
            int ct=0;
            for(Car c:hm.get(x)){
                // System.out.println(c.model);
                // System.out.println(al.get(i));
                if(c.model.equals(al.get(i))){
                    // System.out.println(true);
                    ct++;
                }
            }
            al2.add(ct);
            i++;
        }
        System.out.println("Names of the cars with the highest price");
        System.out.println(al);
        // System.out.println(al2);
        System.out.println("Names of the cars with the highest price and their count");
        for(i=0;i<al.size();i++){
            System.out.println(al.get(i)+" : "+al2.get(i));
        }
        
        
        
    }
}