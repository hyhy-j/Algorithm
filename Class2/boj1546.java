import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        double[] scoreList = new double[n];
        double max = 0;
        for (int i=0; i<n; i++){
            double score = Double.parseDouble(st.nextToken());
            scoreList[i] = score;
            if (score>max) max = score;
        }

        double sum = 0;
        for (int i=0; i<n; i++){
            sum += scoreList[i] / max * 100;
        }

        String result = String.format("%.3f", sum / n);
        bw.write(result);
        bw.close();

    }
}
