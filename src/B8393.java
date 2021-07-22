import java.util.Scanner;

public class B8393 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int inputA = scanner.nextInt();
        int result = 0;

        for (int i = 0; i < inputA; i++) {
            result += (i + 1);
        }

        System.out.println(result);
    }
}
