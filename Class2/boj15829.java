import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int l = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split("");

        long sum = 0;
        long r = 1;
        int m = 1234567891;
        for (int i=0; i<l; i++){
            sum += (((byte)s[i].charAt(0)-96)*r)%m;
            r = (r*31)%m;
        }
        bw.write(sum%m+ "\n");
        bw.flush();
        bw.close();
    }
}
