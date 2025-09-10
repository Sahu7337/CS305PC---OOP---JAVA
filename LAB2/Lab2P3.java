import java.util.Scanner;

public class Lab2P3 {
    public static void main(String[] args) {
        Scanner cal = new Scanner(System.in);
        System.out.print("Enter a number 'a': ");
        int num1 = cal.nextInt();
        System.out.print("Enter a number 'b': ");
        int num2 = cal.nextInt();
        System.out.print("Enter an operator (+, -, *, /, %): ");
        String operator = cal.next();

       var result = switch (operator) {
            case "+" -> num1 + num2; // -> is lamda
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            case "%" -> num1 % num2; 
            default -> "Invaild operator"; // can't use string, because its int, or use var
        };

        System.out.println("The result is: " + result);

    }
}
