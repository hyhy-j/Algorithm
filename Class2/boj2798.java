import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer nmSt = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(nmSt.nextToken());
        int m = Integer.parseInt(nmSt.nextToken());

        StringTokenizer cardSt = new StringTokenizer(br.readLine());
        int[] numList = new int[n];
        for (int i=0; i<n; i++){
            numList[i] = Integer.parseInt(cardSt.nextToken());
        }

        int max = 0;
        for (int i=0; i<n-2; i++){
            for (int p=i+1; p<n-1; p++){
                for (int q=p+1; q<n; q++){
                    int sum = numList[i] + numList[p] + numList[q];
                    if (sum<=m && sum>max) max = sum;
                }
            }
        }

        bw.write(max + "\n");
        bw.flush();
        bw.close();
    }
}
