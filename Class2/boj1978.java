import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int result = 0;
        for (int i=0; i<n; i++){
            double num = Double.parseDouble(st.nextToken());
            int end = (int)Math.floor(Math.sqrt(num));

            for (int p=1; p<=end; p++) {
                if (num!=1){
                    if (p!=1 && num%p==0) break;
                    if (p==end) result++;
                }
            }
        }
        bw.write(result+"\n");
        bw.flush();
        bw.close();
    }
}
