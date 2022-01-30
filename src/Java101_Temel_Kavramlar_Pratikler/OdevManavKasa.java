package Java101_Temel_Kavramlar_Pratikler;

import java.util.Scanner;

public class OdevManavKasa {
    public static void main(String[] args) {
        double armutKg, elmaKg, domatesKg, muzKg, patlicanKg;
        double armutFiyat=2.14, elmaFiyat=3.67, domatesFiyat=1.11, muzFiyat=0.95, patlicanFiyat=5.00;
        double toplamFiyat;

        Scanner kutle = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo:");
        armutKg= kutle.nextDouble();
        System.out.println("-");

        System.out.print("Elma Kaç Kilo:");
        elmaKg= kutle.nextDouble();
        System.out.println("-");

        System.out.print("Domates Kaç Kilo:");
        domatesKg= kutle.nextDouble();
        System.out.println("-");

        System.out.print("Muz Kaç Kilo:");
        muzKg= kutle.nextDouble();
        System.out.println("-");

        System.out.print("Patlıcan Kaç Kilo:");
        patlicanKg= kutle.nextDouble();
        System.out.println("-");


        toplamFiyat = (elmaFiyat*elmaKg+
                armutFiyat*armutKg+
                domatesFiyat*domatesKg+
                muzFiyat*muzKg+
                patlicanFiyat*patlicanKg);

        System.out.println("Toplam Tutar:" + toplamFiyat);


    }
}
