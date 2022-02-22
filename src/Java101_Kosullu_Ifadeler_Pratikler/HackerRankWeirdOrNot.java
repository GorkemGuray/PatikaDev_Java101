package Java101_Kosullu_Ifadeler_Pratikler;

import java.util.Scanner;

public class HackerRankWeirdOrNot {
    public static void main(String[] args) {
        int x;
        Scanner input = new Scanner(System.in);
        x = input.nextInt();

        if (x%2 == 0) {
            if (x>=2 && x<=5) {
                System.out.println("Not Weird");
            } else if (x>=6 && x<=20) {
                System.out.println("Weird");
            } else if (x>20) {
                System.out.println("Not Weird");
            }

        } else {
            System.out.println("Weird");
        }


    }
}
