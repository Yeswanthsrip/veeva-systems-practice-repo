import java.util.*;
class Product{
    String name;
    int price;
    double rating;
    Product(String name,int price,double rating){
        this.name=name;
        this.price=price;
        this.rating=rating;
    }
    @Override
    public String toString(){
        return "Name : "+name+"\n"
                +"Price : "+price+"\n"
                +"Rating : "+rating+"\n";
    }
}
class SortByRating implements Comparator<Product>{
    public int compare(Product p1,Product p2){
        if(p2.rating>p1.rating){
            return 1;
        }
        else if(p2.rating<p1.rating){
            return -1;
        }
        else{
            if(p1.price>p2.price){
                return 1;
            }
            else if(p1.price<p2.price){
                return -1;
            }
            else{
                return 0;
            }
        }
    }
}
class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Product> al=new ArrayList<>();
        while(true){
            System.out.println("Enter the Product name : ");
            String name=sc.next();
            System.out.println("Enter the price : ");
            int price=sc.nextInt();
            System.out.println("Enter the rating : ");
            double rating=sc.nextDouble();
            Product p=new Product(name,price,rating);
            al.add(p);
            System.out.println("Enter 0 to stop giving input : ");
            int t=sc.nextInt();
            if(t==0)
                break;
        }
        Collections.sort(al,new SortByRating());
        // al.sort(new SortByRating());
        System.out.println(al);
    }
}