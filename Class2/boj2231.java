import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        br.close();

        int len = Integer.toString(n).length();
        double maxValue = n;
        if(len!=1 ){
            maxValue = n%(Math.pow(10,Integer.toString(n).length()-1));
            for (int i=1; i<len; i++) maxValue+=9;
        }

        int result = 0;
        for (int i=n-(int)maxValue; i<n; i++){
            String[] numList = Integer.toString(i).split("");
            int sum = i;
            for (String s: numList){
                sum += Integer.parseInt(s);
            }
            if (sum==n) {
                result = i;
                break;
            }
        }
        bw.write(result+"\n");
        bw.flush();
        bw.close();
    }
}