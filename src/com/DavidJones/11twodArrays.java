import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int max_sum = Integer.MIN_VALUE;
        int Rows = arr[0].length;
        int Cols = arr.length;
        int sum = 0;

        for(int a = 0; a < (Rows - 2); a++)
        {
            for(int b = 0; b < (Cols -2); b++){
                sum = (arr[a][b] + arr[a][b + 1] +
                        arr[a][b + 2]) + (arr[a + 1][b + 1]) +
                        (arr[a + 2][b] + arr[a + 2][b + 1] +
                                arr[a + 2][b + 2]);

                max_sum = Math.max(max_sum, sum);
            }
        }
        System.out.println(max_sum);

        scanner.close();
    }
}
