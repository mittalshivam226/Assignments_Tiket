import java.util.Scanner;

public class CustomException extends Exception {
    CustomException(String msg) {
        super(msg);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        try {
            if (n > 9 || n < -9)
                throw new CustomException(n + " has more than one digit.");

            System.out.println(n+ " is a Valid number");
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
}
