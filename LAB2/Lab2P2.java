import java.util.Scanner;

public class Lab2P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number 'a': ");
        int a = sc.nextInt();
        
        System.out.println("The Output is: " + a++ + ++a);

        System.out.println(a++ + ++a + ": is the output");
        //System.out.println("The Output is: " + (a++ + ++a));
        //System.out.println(a++ + ++a);
        
    }
}
