// class ExceptionHandling{
//     public static void main(String args[]){
//         int a=Integer.parseInt(args[0]);
//          int b=Integer.parseInt(args[1]);
//          int c=a/b;
//          System.out.println("c=" + c);

//     }
// }
public class ExceptionHandling{
   static int anyFunction(int x , int y){
            try {
                int a=x/y;
            return a;
                
            } 
            catch (ArithematicException e) {
                System.out.println("Divide by 0");
            }
            return 0;
   }
            
         public static void main(String args[]){
            int a=0,b=0,result;
            try {
                 a=Integer.parseInt(args[0]);
                 b=Integer.parseInt(args[1]);
                 System.out.println("value of a and b"  + a + " " + b);

                
            } catch (Exception e) {
                result=anyFunction(a, b);
                System.out.println("\nResult=" + result);
            }
    }
}