import java.util.Scanner;
import java.util.HashSet;

public class Solution {
  static int sockMerchant(int n, int[] ar) {
    HashSet<Integer> set = new HashSet<Integer>();
    int pair_count=0;
    for (int i=0; i<n; i++) {
      int element = ar[i];
      if (set.contains(element)) {
        set.remove(element);
        pair_count++;
      } else {
        set.add(element);
      }
    }
    return pair_count;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] ar = new int[n];
    for (int i=0; i<n; i++) {
      ar[i] = sc.nextInt();
    }
    int result = sockMerchant(n, ar);
    System.out.println(result);
    sc.close();
  }
}
