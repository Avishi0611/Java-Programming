
public class BreakContinueExample{
    public static void main(String[] args) {

        System.out.println("---- Using break statement ----");
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                System.out.println("Break encountered at i = " + i);
                break; // exits the loop when i = 6
            }
            System.out.println("i = " + i);
        }

        System.out.println("\n---- Using continue statement ----");
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                System.out.println("Continue encountered at i = " + i);
                continue; // skips the rest of the loop when i = 6
            }
            System.out.println("i = " + i);
        }
    }
}