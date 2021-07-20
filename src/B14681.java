import java.util.Scanner;

public class B14681 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputA = scanner.nextInt();
        int inputB = scanner.nextInt();

        if (inputA > 0 && inputB > 0) {
            System.out.println(1);
        } else if (inputA < 0 && inputB > 0) {
            System.out.println(2);
        } else  if (inputA < 0 && inputB < 0) {
            System.out.println(3);
        } else {
            System.out.println(4);
        }
    }
}
