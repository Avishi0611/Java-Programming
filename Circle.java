import java.util.Scanner;
class Circle{
    
    int radius;

    Circle(int radius){

        this.radius=radius;

    }
}
public class Main{
    public static void main(String args[]){
    
    Scanner s=new Scanner(System.in);
    int r=s.nextInt();
    Circle c=new Circle(r);

    System.out.println("The radius of Circle is:" + c.radius);
}

}
