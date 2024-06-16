/***
 Write main method in Solution class.
 In the main method, read a String (which may have alphabets along with numeric digits) and
 print the number of vowel and const Note: The output should be printed in the same format
 as mentioned in the sample output.
 Consider below sample input and output:
 Input:
 Welcome123
 Output:
 Number of Vowels: 3
 Number of Consonants: 4
  ***/
package basic_question;

import java.util.Scanner;

public class Count {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        int n = input.length();
        int i = 0;
        int vowelCount = 0;
        int constant = 0;
        String vowels = "aAeEiIoOuU";
        while(i<n){
            char c = input.charAt(i);
            if(vowels.contains(c+"")){
                vowelCount++;
            }
            else if(!Character.isDigit(c)){
                constant++;
            }
            i++;
        }
        System.out.println("Number of Vowels: "+ vowelCount);
        System.out.println("Number of Constants: "+ constant);
    }
}
