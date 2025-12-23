import java.util.Scanner;

public class LargestOfTwo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number:");
        int a = scan.nextInt();

        System.out.println("Enter second number:");
        int b = scan.nextInt();

        if (a > b) {
            System.out.println("Largest number is " + a);
        } 
        else if (b > a) {
            System.out.println("Largest number is " + b);
        } 
        else {
            System.out.println("Both numbers are equal");
        }

        scan.close();
    }
}
