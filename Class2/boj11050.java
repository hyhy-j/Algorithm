import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[][] resultList = new int[n+1][k+1];

        for (int i=1; i<n+1; i++){
            for (int j=0; j<k+1; j++){
                if (j==0 || j==i) resultList[i][j] = 1;
                else resultList[i][j] = resultList[i-1][j-1] + resultList[i-1][j];
            }
        }

        bw.write(resultList[n][k]+"\n");
        bw.flush();
        bw.close();
    }
}
