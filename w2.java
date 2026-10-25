import java.util.Scanner;

class w2{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        double rad =s.nextDouble();
       double height=s.nextDouble();
    
       double Vol=Math.PI * rad * rad * height;

        System.out.printf("The volume is: %2f" ,Vol);
         
         s.close();





    }
}