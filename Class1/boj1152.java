import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = bf.readLine();
        bf.close();
        StringTokenizer st = new StringTokenizer(s);
        bw.write(st.countTokens()+"\n");
        bw.flush();
        bw.close();
    }
}