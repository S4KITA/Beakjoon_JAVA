import java.util.Scanner;

public class B2884 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputA = scanner.nextInt();
        int inputB = scanner.nextInt();

        if(inputB < 45) {
            inputA--;
            inputB = 60 - (45 - inputB);
            if (inputA < 0) {
                inputA = 23;
            }
            System.out.println(inputA + " " + inputB);
        }
		else{
            System.out.println(inputA + " " + (inputB - 45));
        }
    }
}
