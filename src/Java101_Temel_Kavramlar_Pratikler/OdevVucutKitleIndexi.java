package Java101_Temel_Kavramlar_Pratikler;

import java.util.Scanner;

public class OdevVucutKitleIndexi {
    public static void main(String[] args) {
        double kilo, boy, indeks;

        Scanner girisIndex = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz:");
        boy = girisIndex.nextDouble();
        System.out.println("");

        System.out.print("Lütfen kilonuzu giriniz (kg):");
        kilo = girisIndex.nextDouble();
        System.out.println("");

        indeks = kilo/(boy*boy);

        System.out.println("Vücut Kitle İndeksiniz:" + indeks);
    }
}
