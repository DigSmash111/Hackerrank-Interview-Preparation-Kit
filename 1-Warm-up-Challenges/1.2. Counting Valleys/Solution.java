import java.util.Scanner;

public class Solution {
  static int countingValleys(int n, String s) {
    char[] steps = s.toCharArray();
    int altitude=0;
    int valley_count=0;

    for (int i=0; i<n; i++) {
      if (steps[i]=='U') {
        altitude++;
        if (altitude==0) {
          valley_count++;
        }
      } else if (steps[i]=='D') {
        altitude--;
      }
    }
    return valley_count;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();

    int result = countingValleys(n, s);
    System.out.println(result);

    sc.close();
  }
}
