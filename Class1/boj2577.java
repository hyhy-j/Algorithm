import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        br.close();

        String[] result = Integer.toString(a*b*c).split("");
        int[] numList = new int[10];

        for (String s: result ){
            numList[Integer.parseInt(s)]++;
        }

        for (int i: numList){
            bw.write(i + "\n");
        }
        bw.flush();
        bw.close();
    }
}