import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.close();

        String star = "*";
        for (int i=0; i<n; i++){
            System.out.printf("%"+n+"s\n", star);
            star += "*";
        }
    }
}