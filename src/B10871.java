import java.util.Scanner;

public class B10871 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputA = scanner.nextInt();
        int inputB = scanner.nextInt();
        int arrayA[] = new int[inputA];

        for (int i = 0; i < inputA; i++) {
            arrayA[i] = scanner.nextInt();
        }

        scanner.close();

        for (int i = 0; i < inputA; i++) {
            if (arrayA[i] < inputB) {
                System.out.print(arrayA[i] + " ");
            }
        }

    }
}
