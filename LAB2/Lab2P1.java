import java.util.Scanner;

public class Lab2P1 {
    public static void main(String[] args) {
        Scanner calc = new Scanner(System.in);
        System.out.print("Enter the value number: ");
        int a = calc.nextInt();

        System.out.println("Choose the operator from below: ");
        System.out.println("1. ++ ");
        System.out.println("2. -- ");
        System.out.println("3. + ");
        System.out.println("4. - ");
        System.out.println("5. ~ ");
        System.out.print("Enter the operator: ");
        String operator = calc.next(); // only for this program, not for real calculator

        switch (operator) {
            case "++":
            System.out.println("Result, Post Increment:" + (a++)); //print, then calc
            System.out.println("Result, Pre Increment:" + (++a)); //calc, then print
            break;

            case "--":
            System.out.println("Result, Post Decrement:" + (a--)); //print, then calc
            System.out.println("Result, Pre Decrement:" + (--a)); //calc, then print
            break;

            case "+":
            System.out.println("Result:" + (+a));
            break;

            case "-":
            System.out.println("Result:" + (-a));
            break;

            case "~":
            System.out.println("Complement Result:" + (~a));
            break;

            default:
                System.out.println("Please enter a valid operator ");
        }
    }
}
