import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<Integer> numList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(br.readLine())%42;
            if (!numList.contains(num)) numList.add(num);
        }
        br.close();

        bw.write(numList.size()+"\n");
        bw.flush();
        bw.close();
    }
}
