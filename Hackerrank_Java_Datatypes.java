import java.util.*;

// Solution for the problem from https://www.hackerrank.com/challenges/java-datatypes/problem
public class Hackerrank_Java_Datatypes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your data:");
        System.out.println("The first line should contain the number of test cases T");
        System.out.println("Each line of the subsequent lines should contain a number to fit");
        int t = sc.nextInt(); // number of test cases (lines)
        for (int i = 0; i < t; i++) {
            try {
                String s = sc.nextLine();
                Long x = Long.parseLong(s);
                System.out.println(x + " can be fitted in:");
                if (x >= -128 && x <= 127) {
                    System.out.println("* byte");
                    System.out.println("* short");
                    System.out.println("* int");
                    System.out.println("* long");
                } else {
                    if (x >= -32768 && x <= 32767) {
                        System.out.println("* short");
                        System.out.println("* int");
                        System.out.println("* long");
                    } else {
                        if (x >= -1073741824 && x <= 1073741823) {
                            System.out.println("* int");
                            System.out.println("* long");
                        } else {
                            if (x >= -9223372036854775808 && x <= 9223372036854775807) {
                                System.out.println("* long");
                            }
                        }

                    }
                }

            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }

        }
    }
}