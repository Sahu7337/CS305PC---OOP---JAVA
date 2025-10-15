import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            System.out.println(x/y);
        } catch(InputMismatchException ime) {
            System.out.println(ime.getClass().getName());
        } 
         catch(ArithmeticException ae) {
            System.out.println(ae.getClass().getName() + ": " + ae.getMessage());
        } 
    }
}
