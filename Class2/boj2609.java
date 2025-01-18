import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        int gcdResult = gcd(num1, num2);
        int lcmResult = lcm(num1, num2, gcdResult);
        bw.write(gcdResult + "\n" + lcmResult);
        bw.flush();
        bw.close();
    }

    public static int gcd(int num1, int num2){
        while (num2!=0){
            int r = num1%num2;
            num1 = num2;
            num2 = r;
            gcd(num1, num2);
        }
        return num1;
    }

    public static int lcm(int num1, int num2, int gcdNum){
        int a = num1/ gcdNum;
        int b = num2/ gcdNum;
        return a*b* gcdNum;
    }
}
