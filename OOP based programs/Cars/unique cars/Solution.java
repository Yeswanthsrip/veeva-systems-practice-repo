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
                int t=hm.get(company).size();
                for(Car x:hm.get(company)){
                    if(x.model.equals(c.model)){
                        t++;
                        break;
                    }
                }
                if(t==hm.get(company).size()){
                    hm.get(company).add(c);
                }
            }
            else{
                ArrayList<Car> al=new ArrayList<>();
                al.add(c);
                hm.put(company,al);
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
        
    }
}