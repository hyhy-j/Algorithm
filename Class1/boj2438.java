import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i=0; i<n; i++){
            for (int p=0; p<i+1; p++) System.out.print("*");
            System.out.println();
        }
    }
}