import java.util.Scanner;

public class B2753 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputA = scanner.nextInt();

        if( inputA % 4 == 0 && inputA % 100 != 0 || inputA % 400 == 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
