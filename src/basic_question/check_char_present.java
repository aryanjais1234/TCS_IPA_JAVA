package basic_question;

import java.util.Scanner;

public class check_char_present {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char a = sc.next().charAt(0);
        if(str.contains(a+"")) System.out.println(str.indexOf(a+""));
        else System.out.println("NA");
    }
}
