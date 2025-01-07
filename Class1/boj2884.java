import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();
        sc.close();

        if (m>=45) System.out.printf("%d %d", h, m-45);
        else System.out.printf("%d %d", (h+23)%24, m+15);
    }
}