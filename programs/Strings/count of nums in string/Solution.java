import java.util.*;
class Main {
    static int countOfNumbers(String s){
        String a[]=s.split(",");
        int la=0;
        for(String x:a){
            if(Character.isDigit(x.charAt(0)))
                la++;
        }
        return la;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(countOfNumbers(s));
    }
}