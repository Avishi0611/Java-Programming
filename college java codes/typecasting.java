class typecasting {
    public static void main(String[] args) {

        // Widening (Implicit Typecasting)
        System.out.println("Widening Typecasting:");
        int num = 100;
        System.out.println("Integer value: " + num);
        double data=num;
        System.out.println("Double value: " + data);

        // Narrowing (Explicit Typecasting)

        System.out.println("\nNarrowing Typecasting:");
        double num1 = 99.99;
        int data1 = (int) num;
        System.out.println("Double value: " + num1);
        System.out.println("Integer value: " + data1);
    }
}
