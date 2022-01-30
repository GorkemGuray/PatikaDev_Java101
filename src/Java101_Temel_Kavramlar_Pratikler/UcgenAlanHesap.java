package Java101_Temel_Kavramlar_Pratikler;

import java.util.Scanner;

public class UcgenAlanHesap {
    public static void main(String[] args) {
        double kenar1, kenar2, kenar3,cevre,cevreYarisi,alan;

        Scanner kenar = new Scanner(System.in);

        System.out.print("1.kenar uzunluğunu giriniz:");
        kenar1 = kenar.nextDouble();
        System.out.println("----------");

        System.out.print("2.kenar uzunluğunu gririniz:");
        kenar2 = kenar.nextDouble();
        System.out.println("----------");

        System.out.print("3.kenar uzunluğunu gririniz:");
        kenar3 = kenar.nextDouble();
        System.out.println("----------");

        cevre = (kenar1+kenar2+kenar3);
        cevreYarisi = cevre/2;
        alan = Math.sqrt(cevreYarisi*(cevreYarisi-kenar1)*(cevreYarisi-kenar2)*(cevreYarisi-kenar3));

        System.out.println("**************************************");
        System.out.println("ALAN:" + alan);
        System.out.println("**************************************");


    }
}
