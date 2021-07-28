import java.util.Scanner;

public class B1110 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputA = scanner.nextInt();
        int count = 0;
        int temp = inputA;

        while (true) {
            inputA = ((inputA % 10) * 10) + (((inputA / 10) + (inputA % 10)) % 10);
            count++;

            if (temp == inputA) {
                break;
            }


        }
        System.out.println(count);
    }
}
