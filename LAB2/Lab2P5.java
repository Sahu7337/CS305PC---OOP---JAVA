import java.util.Scanner;

public class Lab2P5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number to be checked: ");
        int n = scan.nextInt();
        boolean isPrime = true;

        try {
            if (n < 2) {
                for (int i = 2; i < Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        isPrime = false;
                        break;
                    } else {
                        continue;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("one is neither prime, nor composite");
        }

        if (isPrime == true)
            System.out.println("The given number is prime: " + n);

        else { // braces are required in java, even though you entered one statement
                System.out.println("The given number is prime: " + n);
        }

    }
}