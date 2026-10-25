
import java.util.Scanner;

class w3{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=1;i<5;i++){
            System.out.printf("%d * %d = %d\n" ,n , i , n*i);
          
        }
        
        s.close();
    }
}