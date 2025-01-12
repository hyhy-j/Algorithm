import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        while (!s.equals("0")){
            StringBuilder sb = new StringBuilder(s);
            if (s.contentEquals(sb.reverse())) bw.write("yes\n");
            else bw.write("no\n");
            bw.flush();
            s = br.readLine();
        }

        bw.close();
    }
}
