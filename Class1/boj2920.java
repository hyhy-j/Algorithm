import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int[] intArray = Arrays.stream(s).mapToInt(Integer::parseInt).toArray();

        String result = "";
        for (int i=0; i<7; i++){
            if (intArray[i]+1==intArray[i+1]) result = "ascending";
            else if (intArray[i]-1==intArray[i+1]) result = "descending";
            else{
                result = "mixed";
                break;
            }
        }

        bw.write(result);
        bw.flush();
        bw.close();
    }
}

