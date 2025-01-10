import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true){
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);
            int[] numList = new int[3];
            for (int i = 0; i < 3; i++) numList[i] = Integer.parseInt(st.nextToken());
            Arrays.sort(numList);

            int a = numList[0], b = numList[1], c = numList[2];
            if (a==0 && b==0 && c==0) break;
            if (a*a + b*b == c*c) bw.write("right\n");
            else bw.write("wrong\n");
            bw.flush();
        }
        br.close();
        bw.close();
    }
}
