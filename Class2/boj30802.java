import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer sizeSt = new StringTokenizer(br.readLine());
        double[] sizeList = new double[6];
        for (int i = 0; i < 6; i++) sizeList[i] = Double.parseDouble(sizeSt.nextToken());

        StringTokenizer tpSt = new StringTokenizer(br.readLine());
        double t = Double.parseDouble(tpSt.nextToken());
        int p = Integer.parseInt(tpSt.nextToken());
        br.close();

        int tBundle = 0;
        for (double d: sizeList){
            tBundle += Math.ceil(d/t);
        }
        bw.write(tBundle + "\n");
        bw.write( n / p + " " + n % p + "\n");
        bw.flush();
        bw.close();
    }
}
