package Java101_Kosullu_Ifadeler_Pratikler;

import java.util.Scanner;

public class UcakBiletiFiyat {
    public static void main(String[] args) {
        int mesafe, yas, yolculukTip;
        float kmTutar=0.10f;
        float finalTutar, normalTutar, yasIndirimi, gidisDonusIndirimi;

        Scanner giris = new Scanner(System.in);

        System.out.print("Mesafeyi KM türünden giriniz:");
        mesafe = giris.nextInt();

        System.out.print("Yaşınızı giriniz:");
        yas = giris.nextInt();

        System.out.print("Yolculuk tipini giriniz (1=> Tek Yön, 2=>Gidiş-Dönüş):");
        yolculukTip = giris.nextInt();

        if (mesafe>0 && yas>=0 && (yolculukTip==1 || yolculukTip==2)) {
            normalTutar = mesafe*kmTutar;

            if (yas<12) {
                yasIndirimi = normalTutar*0.50f;
            } else if (yas>=12 && yas<=24) {
                yasIndirimi = normalTutar*0.10f;
            } else if (yas>65) {
                yasIndirimi = normalTutar*0.30f;
            } else {
                yasIndirimi = 0;
            }

            if (yolculukTip==1) {
                finalTutar = normalTutar-yasIndirimi;
            } else {
                finalTutar = ((normalTutar-yasIndirimi)*0.80f)*2;
            }

            System.out.println("Toplam Tutar = "+finalTutar + " TL");


        } else {
            System.out.println("Hatalı Veri Girdiniz!");
        }
    }
}
