package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**

 Provided a String of length N, your task is to find out whether or not the given string is a prime string. A prime string is a string in which the sum of the ASCII value of all the characters is prime.

 Input:
 The first line of the input contains an integer T, denoting the number of test cases. Then T test case follows. The first line of each test case contains an integer N denoting the length of the string, next line contains the input string str of length N.

 Output:
 For each test case print "YES" if the string is prime string else print "NO", on a new line.


 Constraints:
 1<=T<=102
 1<=N<=108

 Example:
 Input
 3
 13
 geeksforgeeks
 4
 JiiT
 5
 India
 Output
 YES
 NO
 NO

 */
public class App1 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(reader.readLine());
            String s = reader.readLine();
            int sum = 0;
            for (int i = 0; i < s.length(); i++) {
                sum += s.charAt(i);
            }
            if (isPrime(sum)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    private static boolean isPrime(int n) {
        for (int i = 2; 2 * i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
