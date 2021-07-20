import java.util.Scanner;

public class B2588 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputA = scanner.nextInt();
        String inputB = scanner.next();

        System.out.println(inputA * (inputB.charAt(2) - '0'));
        System.out.println(inputA * (inputB.charAt(1) - '0'));
        System.out.println(inputA * (inputB.charAt(0) - '0'));
        System.out.println(inputA * Integer.parseInt(inputB));

    }

}
