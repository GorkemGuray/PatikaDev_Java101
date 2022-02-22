package Java101_Kosullu_Ifadeler_Pratikler;

import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        int year;

        Scanner giris = new Scanner(System.in);
        System.out.print("Yıl Giriniz (YYYY):");
        year = giris.nextInt();

        if (year%4==0 && year%100!=0) {
            System.out.println(year + " bir artık yıldır !");
        } else if (year%100==0 && year%400==0) {
            System.out.println(year+" bir artık yıldır !");
        } else {
            System.out.println(year+" bir artık yıl değildir !");
        }
    }
}
