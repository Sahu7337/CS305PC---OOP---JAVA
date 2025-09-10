import java.util.Scanner;

public class Lab2P4 {
    public static void main(String[] args) {
        Scanner bit = new Scanner(System.in);

        System.out.print("Enter a value for 'a': ");
        int a = bit.nextInt();
        System.out.print("Enter a value for 'b': ");
        int b = bit.nextInt();

        System.out.println("The output after bitwise AND is: " + (a & b)); // a
        System.out.println("The output after bitwise OR is: " + (a | b)); // b
        System.out.println("The output after bitwise X-OR is: " + (a ^ b)); // After XOR operation
    }
}
