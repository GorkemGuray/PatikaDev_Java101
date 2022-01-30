package Java101_Temel_Kavramlar_Pratikler;

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        double gidilenKm, odenecekTutar, tempOdenecekTutar;
        Scanner girisKm = new Scanner(System.in);

        System.out.print("Gidilen KM'yi giriniz:");
        gidilenKm = girisKm.nextDouble();
        System.out.println("----------------------");

        tempOdenecekTutar=10 + (gidilenKm*2.20);

        if (tempOdenecekTutar<20) {
            odenecekTutar=20;
        } else {
            odenecekTutar=tempOdenecekTutar;
        }

        System.out.println("ÖDENECEK TUTAR (TL):"+ odenecekTutar);



    }
}
