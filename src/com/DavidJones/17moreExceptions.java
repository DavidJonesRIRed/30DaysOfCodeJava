import java.util.*;
import java.io.*;

//Write your code here
class Calculator{
    int n = 0;
    int p = 0;
    int result = 0;

    int power(int newN,int newP) throws Exception{
        this.n = newN;
        this.p = newP;

        if(n < 0 || p < 0){
            throw new Exception("n and p should be non-negative");
        }

        result = (int)Math.pow(n,p);


        return result;
    }
}

class Solution{

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {

            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}
