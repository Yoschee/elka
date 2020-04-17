public class Main {
    public static void main(String[] args) {
        int n = 8;
        for (int x = 1; x <= n + 1; x++){
            System.out.print(" ");
        }
        System.out.println("*");
        for (int x = n - 1; x > 0; x--) {
            for (int i = 1; i <= x + 1; i++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int k = 1; k < 2 * n - 2 * x; k++) {
                System.out.print(" ");
            }
                System.out.println("*");
        }
        for (int x = n - 2; x > 0; x--) {
            for (int i = 1; i <= n - x + 1; i++) {
                System.out.print(" ");
            }
            System.out.print("* ");
            for (int k = 1; k < 2 * x - 1; k++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int x = 1; x <= n + 1; x++){
            System.out.print(" ");
        }
        System.out.println("*");
    }
}