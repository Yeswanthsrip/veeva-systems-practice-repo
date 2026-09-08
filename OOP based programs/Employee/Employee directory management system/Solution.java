import java.util.*;
class Employee{
    String name;
    String job;
    double salary;
    String dateofjoin;
    Employee(String name,String job,double salary,String dateofjoin){
        this.name=name;
        this.job=job;
        this.salary=salary;
        this.dateofjoin=dateofjoin;
    }
    public String toString(){
        return "Name : "+name+"\n"
                +"Job : "+job+"\n"
                +"salary : "+salary+"\n"
                +"dateofjoin : "+dateofjoin+"\n";
    }
}
class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,Employee> employees=new HashMap<>();
        //Inserting emp records
        while(true){
            System.out.println("Enter the emp id : ");
            int id=sc.nextInt();
            System.out.println("Enter the emp name : ");
            String name=sc.next();
            System.out.println("Enter the emp job : ");
            String job=sc.next();
            System.out.println("Enter the emp salary : ");
            double salary=sc.nextDouble();
            System.out.println("Enter the emp dateofjoin : ");
            String dateofjoin=sc.next();
            Employee e=new Employee(name,job,salary,dateofjoin);
            if(!employees.containsKey(id)){
                employees.put(id,e);
            }
            else{
                System.out.println("Employee already exists...");
            }
            System.out.println("enter o to stop giving input");
            int t=sc.nextInt();
            if(t==0)
                break;
        }
        System.out.println(employees);
        // Search employees based on the id
        System.out.println("Enter the emp id to search");
        int t=sc.nextInt();
        boolean tb=false;
        for(Map.Entry<Integer,Employee> e:employees.entrySet()){
            Integer key=e.getKey();
            if(key==t){
                System.out.println("Employee identified....with id : "+t);
                System.out.println(e.getValue());
                tb=true;
                break;
            }
        }
        if(!tb)
            System.out.println("Employee not found...with the given id : "+t);
        // Delete employees based on the id
        System.out.println("Enter the emp id to deleted");
        t=sc.nextInt();
        tb=false;
        for(Map.Entry<Integer,Employee> e:employees.entrySet()){
            Integer key=e.getKey();
            if(key==t){
                System.out.println("Employee deleted....with id : "+t);
                employees.remove(key);
                System.out.println(employees);
                tb=true;
                break;
            }
        }
        if(!tb)
            System.out.println("Employee not found...with the given id : "+t);
        
        
        
        
        
        
        
        
        
        
    }
}