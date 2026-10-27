public class HalfButterflyPattern {
    public static void main(String[] args) {
        int n = 5; // Height of the half-butterfly (number of rows in the top half)

        // 1. Upper Half
        for (int i = 1; i <= n; i++) {
            // Print stars on the left side
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }

        // 2. Lower Half
        for (int i = n - 1; i >= 1; i--) {
            // Print stars on the left side
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }
    }
}
