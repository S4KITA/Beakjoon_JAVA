import java.util.Scanner;

public class B10951 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int inputA = scanner.nextInt();
            int inputB = scanner.nextInt();

            System.out.println(inputA + inputB);
        }
    }
}
