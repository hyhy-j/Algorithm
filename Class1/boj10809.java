import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        br.close();

        for (int i=97; i<123; i++){
            bw.write((byte)(s.indexOf(i)) + " ");
            bw.flush();
        }
        bw.close();
    }
}
