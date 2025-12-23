import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = scan.nextInt();

        if (n > 0) {
            System.out.println("Positive");
        } 
        else if (n < 0) {
            System.out.println("Negative");
        } 
        else {
            System.out.println("Zero");
        }

        scan.close();
    }
}
