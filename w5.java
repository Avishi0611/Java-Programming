import java.util.Scanner;
class w5{
    public static void main(String[] agrs){
        Scanner s=new Scanner(System.in);
        double length=s.nextDouble();
        double Breadth=s.nextDouble();

        double Area=length*Breadth;
        double Perimeter=2*(length+Breadth);

        System.out.printf("The area is:%2f \n" ,Area);
        System.out.printf("The perimeter is:%2f" ,Perimeter);



        s.close();
        
    }
}