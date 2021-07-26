import java.util.Scanner;

public class B11022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputA = scanner.nextInt();

        for (int i = 1; i <= inputA; i++) {
            int inputB = scanner.nextInt();
            int inputC = scanner.nextInt();

            System.out.println("Case #" + i + ": " + inputB + " + " + inputC + " = " + (inputB + inputC));
        }
    }
}
    