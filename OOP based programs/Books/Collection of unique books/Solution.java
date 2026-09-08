import java.util.*;
class Book{
    int code;
    String title;
    String author;
    int price;
    Book(int code,String title,String author,int price){
        this.code=code;
        this.title=title;
        this.author=author;
        this.price=price;
    }
    @Override
    public String toString(){
        return "Code : "+code+"\n"
                +"Title : "+title+"\n"
                +"Author : "+author+"\n"
                +"Price : "+price+"\n";
    }
}
class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Book> al=new ArrayList<>();
        HashSet<Integer> hs=new HashSet<>();
        while(true){
            System.out.println("Enter the book code : ");
            int code=sc.nextInt();
            System.out.println("Enter the title : ");
            String title=sc.next();
            System.out.println("Enter the author : ");
            String author=sc.next();
            System.out.println("Enter the price : ");
            int price=sc.nextInt();
            Book b=new Book(code,title,author,price);
            if(!hs.contains(code)){
                al.add(b);
                hs.add(code);
            }
            System.out.println("Enter 0 to stop giving input : ");
            int t=sc.nextInt();
            if(t==0)
                break;
        }
        System.out.println(al);
        System.out.println(hs);
        // for(Book x:al){
        //     System.out.println("Book");
        //     System.out.println("Code : "+x.code);
        //     System.out.println("Title : "+x.title);
        //     System.out.println("Author : "+x.author);
        //     System.out.println("Price : "+x.price);
        // }
        //Using toString();
        for(Book x:al){
            System.out.println(x);
        }
        while(true){
            System.out.println("Enter the book code to show the details");
            int c=sc.nextInt();
            if(hs.contains(c)){
                for(Book x:al){
                    if(x.code==c){
                        System.out.println("Code : "+x.code);
                        System.out.println("Title : "+x.title);
                        System.out.println("Author : "+x.author);
                        System.out.println("Price : "+x.price);
                        break;
                    }
                }
            }
            else{
                System.out.println("Give valid book code.....");
            }
            System.out.println("Enter 0 to stop giving input : ");
            int t=sc.nextInt();
            if(t==0)
                break;
        }
    }
}