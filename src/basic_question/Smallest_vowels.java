package basic_question;

import java.util.Scanner;

public class Smallest_vowels {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String vowels[] = {"a","e","i","o","u"};
        for(int i=0;i<vowels.length;i++){
            if(str.contains(vowels[i])){
                System.out.println("Smallest Vowel : "+vowels[i]);
                return;
            }
        }
    }
}
