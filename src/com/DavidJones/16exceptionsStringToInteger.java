import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();

        //int num = Integer.parseInt(S);

        try{
            int num = Integer.parseInt(S);
            System.out.println(num);
        }
        catch(NumberFormatException e){
            System.out.println("Bad String");
        }

    }
}