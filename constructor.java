import java.util.Scanner;
class P{
    int l,b;
    P(){
        l=0;
        b=0;

    }
    P(int x,int y){
        l=x;
        b=y;
    }
    void x(){
        int perimeter=2*(l+b);
        System.out.println(perimeter);
    }
}
class Constructor{
    public static void main(String[] args){
        P a=new P();
        P b=new P(2,6);
        a.x();
        b.x();
    }
}