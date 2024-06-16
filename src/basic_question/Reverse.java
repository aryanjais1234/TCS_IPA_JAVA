/**Write main method in Solution class.
In the main method, write code to read a
numeric digit(without any alphabets or special characters) using
Scanner and print it in the reverse sequence as they appear in the input.
Consider below sample input and output:
Input:
12345
Output:
Reverse of the number is 54321 **/
package basic_question;
import java.util.*;
public class Reverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int rev = 0;
        while(num>0){
            rev = rev*10+num%10;
            num/=10;
        }
        System.out.println(rev);
    }
}
