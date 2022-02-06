package Java101_Kosullu_Ifadeler_Pratikler;

import java.util.Scanner;

public class SınıfGecmeDurumu {
    public static void main(String[] args) {
        int mat,fiz,turkce,kimya,muzik;
        int toplam=0, sayac=0;
        double ortalama;


        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz : ");
        mat = input.nextInt();
        if (mat>=0 && mat<=100) {
            toplam+=mat;
            sayac+=1;
        }

        System.out.print("Fizik Notunuz : ");
        fiz = input.nextInt();
        if (fiz>=0 && fiz<=100) {
            toplam+=fiz;
            sayac+=1;
        }

        System.out.print("Türkçe Notunuz : ");
        turkce = input.nextInt();
        if (turkce>=0 && turkce<=100) {
            toplam+=turkce;
            sayac+=1;
        }

        System.out.print("Kimya Notunuz : ");
        kimya = input.nextInt();
        if (kimya>=0 && kimya<=100) {
            toplam+=kimya;
            sayac+=1;
        }

        System.out.print("Müzik Notunuz : ");
        muzik = input.nextInt();
        if (muzik>=0 && muzik<=100) {
            toplam+=muzik;
            sayac+=1;
        }

        if (sayac>0) {
            ortalama = toplam/sayac;
            if (ortalama>=55) {
                System.out.println("***GEÇTİNİZ***\nORATALAMA:"+ortalama);
            } else {
                System.out.println("!!!Kaldınız!!!\nORATALAMA:"+ortalama);
            }
        } else {
            System.out.println("Geçerli hiçbir not olmadığından değerlendirme yapılamadı.");
        }

    }



}
