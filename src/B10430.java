import java.util.Scanner;

public class B10430 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputA = scanner.nextInt();
        int inputB = scanner.nextInt();
        int inputC = scanner.nextInt();

        System.out.println((inputA + inputB) % inputC);
        System.out.println(((inputA % inputC) + (inputB % inputC)) % inputC);
        System.out.println((inputA * inputB) % inputC);
        System.out.println(((inputA % inputC) * (inputB % inputC)) % inputC);

    }
}