import java.util.Scanner;

public class B1330 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputA = scanner.nextInt();
        int inputB = scanner.nextInt();

        if (inputA > inputB) {
            System.out.println(">");
        } else if (inputA < inputB) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }
    }
}
