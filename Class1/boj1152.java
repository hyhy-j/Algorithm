import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();
      sc.close();
      String[] words = s.split(" ");
      int count=0;
      for (String word : words){
          if (!word.isBlank()) count+=1;
      }
      System.out.println((count));
    }
}