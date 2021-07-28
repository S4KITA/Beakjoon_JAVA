import java.util.Scanner;

public class B10952 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int inputA = scanner.nextInt();
            int inputB = scanner.nextInt();

            if (inputA == 0 && inputB == 0) {
                break;
            }

            System.out.println(inputA + inputB);
        }
    }
}
