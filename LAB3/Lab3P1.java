/* 
// this is using while loop
import java.util.Scanner;

public class Lab3P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value for 'n': ");
        int n = sc.nextInt();

        int i = 2;

        while (i < n) {
            int j = 2;
            int count = 0;

            if (i == 2) {
                count++;
            }

            while (j < i) {
                if (i % j == 0) {
                count = 0;
                    break;
                } else {
                    count++;
                    j++;
                }
            }
            if (count > 0)
                System.out.println(i);
            i++;
            }   
        }
    }
*/

/* 
import java.util.Scanner;

// this is using 'for loop'

public class Lab3P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value for 'n': ");
        int n = sc.nextInt();

        for (int i = 2; i <= n; i++) {
            //int j = 2;
            int count = 0;

            if (i == 2) {
                count++;
            }

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count = 0;
                    break;
                } else {
                    count++;
                }
            }

            if (count > 0)
                System.out.println(i);
            }   
        }
    }
*/

import java.util.Scanner;

public class Lab3P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value for 'n': ");
        int n = sc.nextInt();

        int i = 2;

        do {
            int j = 2;
            int count = 0;

            /*
            A joke on doWhile condition.
            Imagine you are standing on a mountain cliff and you want to jump off. 
            First you will check whether their is water below to break your fall, 
            then you will jump. This is while condition. And same as 'for' condition.
            In doWhile, you'll first jump then check whether there is water down below to break your fall.
            */

            do {
                if (i % j == 0) {
                count = 0;
                    break;
                } else {
                    count++;
                    j++;
                }
            } while (j < i);

            if (i == 2) {
                count++;
            }

            if (count > 0)
                System.out.println(i);
            i++;
            } while (i < n);
        }
    }
