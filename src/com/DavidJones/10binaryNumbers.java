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
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();

        String binary = Integer.toString(n, 2);

        int count = 0;

        char[] binaryArr = binary.toCharArray();

        for(int i = 0; i < binaryArr.length; i++){
            if(binaryArr[i] == '1'){
                count = count + 1;
            }
            else if(binaryArr[i] == '0' && count >= 1){
                break;
            }
        }

        System.out.println(count);
    }
}
