import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        System.out.println(a+b-c);

        String stringNum = a + Integer.toString(b);
        int result = Integer.parseInt(stringNum) - c;
        System.out.println(result);
    }
}