import java.util.Scanner;
class w1{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        if(n<0){
            System.out.println("Negative");

        }
        else{
             System.out.println("Positive");
        }
        in.close();

    }
    
}