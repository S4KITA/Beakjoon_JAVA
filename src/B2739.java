import java.util.Scanner;

public class B2739 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputA = scanner.nextInt();

        for (int i = 1; i < 10; i++) {
            System.out.println(inputA + " * " + i + " = " + (inputA * i));
        }
    }
}
