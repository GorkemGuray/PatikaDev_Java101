package Java101_Kosullu_Ifadeler_Pratikler;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi1, sayi2,secim;

        System.out.print("1.sayıyı giriniz:");
        sayi1=input.nextInt();
        System.out.println(" ");
        System.out.print("2.sayıyı giriniz:");
        sayi2=input.nextInt();
        System.out.println(" ");

        System.out.println("Yapmak istediğiniz işlemi seçiniz:");
        System.out.println("1-Toplama");
        System.out.println("2-Çıkarma");
        System.out.println("3-Bölme");
        System.out.println("4-Çarpma");

        secim=input.nextInt();

        switch (secim) {
            case 1:
                System.out.println("Sonuç:" + (sayi1+sayi2));
                break;

            case 2:
                System.out.println("Sonuç:" + (sayi1-sayi2));
                break;

            case 3:
                if (sayi2!=0) {
                    System.out.println("Sonuç:" + (sayi1/sayi2));
                } else {
                    System.out.println("Sayı 0 a bölünemez!");
                }

                break;

            case 4:
                System.out.println("Sonuç:" + (sayi1*sayi2));
                break;

            default:
                System.out.println("Yanlış seçim yaptınız.");
        }



    }
}
