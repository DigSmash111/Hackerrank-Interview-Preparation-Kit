import java.util.Scanner;

public class Solution {
  static void swap(int[] arr, int x, int y) {
    int temp = arr[x];
    arr[x] = arr[y];
    arr[y] = temp;
  }
  static void minimumBribes(int[] q) {
    int swapCounter=0;
    for (int i=q.length-1; i>=0; i--) {
      // if at least one bribe happened
      if (q[i] != (i+1)) {
        // if a person made only 1 bribe
        if ((i-1)>=0 && q[i-1]==(i+1)) {
          swapCounter++;
          swap(q, i-1, i);
        }
        // if a person made only 2 bribes
        else if ((i-2)>=0 && q[i-2]==(i+1)) {
          swapCounter+=2;
          swap(q, i-2, i-1);
          swap(q, i-1, i);
        } else {
          System.out.println("Too chaotic");
          return;
        }
      }
    }
    System.out.println(swapCounter);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] q = new int[n];

    for (int i=0; i<n; i++) {
      q[i] = sc.nextInt();
    }

    minimumBribes(q);

    sc.close();
  }
}
