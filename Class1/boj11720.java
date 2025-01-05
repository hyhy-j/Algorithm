import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String numbers = sc.next();
        sc.close();
        String[] numbersList = numbers.split("");

        int sum = 0;
        for (String num : numbersList){
            sum += Integer.parseInt(num);
        }

        System.out.println(sum);
    }
}
