import java.util.Scanner;

public class Lab2P2a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number 'a': ");
        int a = sc.nextInt();
        System.out.print("Enter a number 'b': ");
        int b = sc.nextInt();

        System.out.print("Enter the operator: ");
        String op = sc.next();

        String str = switch (op) {
            case "++", "+" -> "hello";
            case "--" -> "Not good";

            default -> "Sorry";
        };

        System.out.println("The output is: " + str);
    }    
}
