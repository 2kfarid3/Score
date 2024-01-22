package az.edu.turing;

import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if(num < 0 || num > 100){
            System.out.println("Invalid input");
        } else if(num >=91){
            System.out.println("A");
        } else if(num >= 81){
            System.out.println("B");
        } else if(num >=71){
            System.out.println("C");
        } else{
            System.out.println("Zerbeci deyilsin,get tezden calis");
        }
    }
}
