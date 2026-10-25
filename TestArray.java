class TestArray{
    public static void main(String[] args) {
        int a[]={10,20,30,40,50};
        // Traversing an array
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
         // average of an array
         float sum=0,avg;
         for(int i=0;i<a.length;i++)
            sum+=a[i];
            avg=sum/a.length;
             System.out.println("The avg is:" + avg);

         
        

    }
}