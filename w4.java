import java.util.Scanner;

class w4{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num1=s.nextInt();
        int num2=s.nextInt();

        int quotient=num1/num2;
        int remainder=num1 % num2;

        System.out.printf("The Quotient is: %d and the remainder is: %d" ,quotient , remainder);
  
        
        s.close();
    }
}