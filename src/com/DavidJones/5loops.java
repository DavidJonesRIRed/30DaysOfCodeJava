import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);

        int howMany = scan.nextInt();
        scan.nextLine();

        for(int i = 0; i < howMany; i++){
            String newString = scan.nextLine();
            char[] ch = newString.toCharArray();
            String finalString = "";

            for(int j = 0; j < ch.length; j += 2){
                finalString = finalString + ch[j];
            }

            finalString = finalString + " ";

            for(int k = 1; k < ch.length; k += 2){
                finalString = finalString + ch[k];
            }

            System.out.println(finalString);

        }

    }
}