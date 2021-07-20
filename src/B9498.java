import java.util.Scanner;

public class B9498 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputA = scanner.nextInt();

        if (100 >= inputA && inputA >= 90) {
            System.out.println("A");
        } else if ( 90 > inputA && inputA >= 80 ) {
            System.out.println("B");
        } else if ( 80 > inputA && inputA >= 70 ) {
            System.out.println("C");
        } else if ( 70 > inputA && inputA >= 60 ) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
