public class RecursiveFibbonaci{
    int n;
    int fibbonaci(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            return (fibbonaci(n-1) + fibbonaci(n-2));
        }
    }

    public static void main(String[] args) {
        RecursiveFibbonaci x=new RecursiveFibbonaci();
        x.n=Integer.parseInt(args[0]);
        for(int i=0;i<=x.n;i++){
             System.out.println(x.fibbonaci(i));

        }
       
    }
}