import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int sum = 1;
        int count = 1;
        while (sum<n){
            sum += 6*count;
            count++;
        }
        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }
}
