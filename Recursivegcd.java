public class Recursivegcd{
    int m,n;
    int gcd(int m ,int n){
        if(m>n) return gcd(n,m);
        if(m==n) return m;
        if(m==0) return n;
        if(m==1) return 1;
        return gcd(m,n%m);
    }

    public static void main(String[] args) {
        Recursivegcd x= new Recursivegcd();
        x.m=Integer.parseInt(args[0]);
        x.n=Integer.parseInt(args[1]);

        System.out.println("Gcd of" + " " + x.m + " and " + x.n + " " + "is:" + x.gcd(x.m , x.n));
    }
} 