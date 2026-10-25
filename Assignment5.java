
import java.util.Scanner;

 class cls1{
 
    void add(int a , int b){
        System.out.println(a+b);
 } 

};

class cls2 extends cls1{
    void multiplication(int a , int b){
       System.out.println(a*b);

    }
    void square(int a , int b){
         System.out.println((a*a )+(b*b));
}

};

public class Assignment5{
    public static void main(String[] args) {
        cls2 obj=new cls2();
        // obj.add(5,7);//12
        // obj.multiplication(5, 6);//30
        // obj.square(2, 3);//13

        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();

        obj.add(a, b);
        obj.multiplication(a, b);
        obj.square(a, b);

        
    }
}