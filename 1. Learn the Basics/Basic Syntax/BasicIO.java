import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a = ");
        int a = sc.nextInt(); // Read user input

        int b = 5;
        int c;

        c = -3;

        int d = a + b * c;

        System.out.println("d = " + d);

        sc.close();
    }
}
