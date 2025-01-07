import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i=0; i<t; i++){
            int h = sc.nextInt(), w = sc.nextInt(), n = sc.nextInt();
            int roomH = n%h!=0 ? n%h : h;
            int roomW = n%h!=0 ? ((int) n / h) + 1 : n/h;
            System.out.printf("%d%02d\n", roomH, roomW );
        }
        sc.close();
    }
}