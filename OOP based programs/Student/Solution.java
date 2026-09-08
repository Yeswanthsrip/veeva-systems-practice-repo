import java.util.*;
class Student{
    String name;
    String rollno;
    Student(String name,String rollno){
        this.name=name;
        this.rollno=rollno;
    }
    @Override
    public String toString(){
        return "Name : "+name+"\n"
                +"RollNo : "+rollno+"\n";
    }
}
class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Student> al=new ArrayList<>();
        HashSet<String> hs=new HashSet<>();
        while(true){
            System.out.println("Enter the name : ");
            String name=sc.next();
            System.out.println("Enter the rollno : ");
            String rollno=sc.next();
            Student s=new Student(name,rollno);
            al.add(s);
            hs.add(rollno);
            System.out.println("Enter 0 to stop giving input : ");
            int t=sc.nextInt();
            if(t==0)
                break;
        }
        System.out.println(al);
        System.out.println("Number of unique students : "+hs.size());
    }
}