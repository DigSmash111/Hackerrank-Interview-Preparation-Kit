import java.util.Scanner;

public class Solution {
  static int hourglassSum(int[][] arr) {
    int max_sum = Integer.MIN_VALUE;

    for (int i=0; i<arr.length-2; i++) {
      for (int j=0; j<arr.length-2; j++) {
        int sum = (
          arr[i][j]+arr[i][j+1]+arr[i][j+2]
          +arr[i+1][j+1]
          +arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2]
        );
        max_sum = Math.max(max_sum, sum);
      }
    }
    return max_sum;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[][] arr = new int[6][6];
    for (int i=0; i<6; i++) {
      for (int j=0; j<6; j++) {
        arr[i][j] = sc.nextInt();
      }
    }
    int result = hourglassSum(arr);
    System.out.println(result);
    sc.close();
  }
}
