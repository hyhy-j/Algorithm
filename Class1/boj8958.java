import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int count = 0;
        int score = 0;
        for (int i=0; i<n; i++){
            String[] answer = br.readLine().split("");
            for (String s: answer){
                if (s.equals("O")){
                    count ++;
                    score += count;
                }
                else count=0;
            }
            bw.write(score+"\n");
            bw.flush();
            count=0;
            score=0;
        }
        br.close();
        bw.close();
    }
}
