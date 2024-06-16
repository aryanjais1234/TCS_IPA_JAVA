package basic_question;

import java.util.Scanner;

public class Perfect_Sq {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==1 || n==0) {
            System.out.println("True");
            return;
        }
        for(int i=2;i<n/2;i++){
           if(i*i==n) {
               System.out.println("True");
               return;
           }
        }

        System.out.println("False");
    }
}
