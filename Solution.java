import java.util.Scanner;

///
///
///
public class Solution {

  ///
  ///
  ///
  static int slidingWindow(int[] arr, int k) {

    // **** compute the initial max sum (first k elements) ****
    int maxSum = 0;
    for (int i = 0; i < k; i++)
      maxSum += arr[i];

    // ???? ????
    System.out.println("slidingWindow <<< maxSum: " + maxSum);

    // **** loop updating the max sum ****
    int sum = maxSum;
    for (int i = k; i < arr.length; i++) {

      // **** update the sum ****
      sum += (-arr[i - k] + arr[i]);

      // ***** update the max sum (if needed) ****
      if (sum > maxSum)
        maxSum = sum;

      // ???? ????
      System.out.println("slidingWindow <<< i: " + i + " sum: " + sum + " maxSum: " + maxSum);
    }

    // **** return the max sum ****
    return maxSum;
  }

  //
  // Test scaffolding.
  //
  public static void main(String[] args) {

    // **** open scanner ****
    Scanner sc = new Scanner(System.in);

    // **** read number of integers in array ****
    int n = sc.nextInt();

    // ???? ????
    System.out.println("main <<< n: " + n);

    // **** allocate array of integers ****
    int[] arr = new int[n];

    // **** read array of integers ****
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    // ???? ????
    System.out.print("main <<< arr: [");
    for (int i = 0; i < arr.length; i++) {
      if (i < (arr.length - 1))
        System.out.print(arr[i] + " ");
      else
        System.out.print(arr[i]);
    }
    System.out.println("]");

    // **** read k ****
    int k = sc.nextInt();

    // ???? ????
    System.out.println("main <<< k: " + k);

    // **** close scanner ****
    sc.close();

    // **** ****
    System.out.println("main <<< maxSum: " + slidingWindow(arr, k));
  }
}
