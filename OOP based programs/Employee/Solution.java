import java.util.*;
class Employee{
    int id;
    String name;
    int salary;
    Employee(int id,String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    @Override
    public String toString(){
        return "Id : "+id+"\n"
                +"Name : "+name+"\n"
                +"Salary : "+salary+"\n";
    }
}
class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Employee> al=new ArrayList<>();
        while(true){
            System.out.println("Enter the Employee id : ");
            int id=sc.nextInt();
            System.out.println("Enter the name : ");
            String name=sc.next();
            System.out.println("Enter the salary : ");
            int salary=sc.nextInt();
            Employee e=new Employee(id,name,salary);
            al.add(e);
            System.out.println("Enter 0 to stop giving input : ");
            int t=sc.nextInt();
            if(t==0)
                break;
        }
        System.out.println(al);
        System.out.println("enter the salary where the employees want to be displayed more than that price");
        int t=sc.nextInt();
        for(Employee x:al){
            if(x.salary>t){
                System.out.print(x.name+" ");
            }
        }
        System.out.println();
    }
}