package basic_question;

import java.util.Collections;
import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder ans = new StringBuilder();
        String str = sc.nextLine();
        str = str.toLowerCase();
        ans.append(str);
        ans.reverse();

        System.out.println(ans);
    }
}
