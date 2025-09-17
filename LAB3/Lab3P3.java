//import java.util.Scanner;

public class Lab3P3 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        int a = 10;
        String b = "Hi";

        System.out.println("------------------Constructor Overloaading------------------");

        Lab3P3 l = new Lab3P3();
        Lab3P3 l1 = new Lab3P3(a);
        Lab3P3 l2 = new Lab3P3(b);
        Lab3P3 l3 = new Lab3P3(a, b);

        System.out.println("------------------Method Overloaading------------------");

        l.show();
        l1.show(10);
        l2.show("String");
        l3.show(10, "String");
    }

    Lab3P3() {
        System.out.println("Constructer without parmas");
    }

    Lab3P3(int x) {
        System.out.println("Constructer one parmas: " + x);
    }

    Lab3P3(String s) {
        System.out.println("Constructer one parmas: " + s);
    }

    Lab3P3(int x, String s) {
        System.out.println("Constructer one parmas: " + x + " " + s);
    }

    public void show() {
        System.out.println("Method without parmas");
    }

    public void show(int x) {
        System.out.println("Method one parmas, int");
    }

    public void show(String s) {
        System.out.println("Method String parmas");
    }

    public void show(int x, String s) {
        System.out.println("Method String, and int parmas");
    }
}