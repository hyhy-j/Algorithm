import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        for (int i=0; i<t; i++){
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            int result = people(k, n);
            bw.write(result + "\n");
            bw.flush();
        }

        br.close();
        bw.close();
    }

    public static int people(int k, int n){
        int[][] peopleList = new int[k + 1][n];

        for (int i=0; i<k+1; i++){
            for (int j=0; j<n; j++){
                if (i==0) peopleList[i][j] = j+1;
                else{
                    if (j==0) peopleList[i][j] = 1;
                    else peopleList[i][j] = peopleList[i][j-1] + peopleList[i-1][j];
                }
            }
        }

        return peopleList[k][n-1];
    }
}
