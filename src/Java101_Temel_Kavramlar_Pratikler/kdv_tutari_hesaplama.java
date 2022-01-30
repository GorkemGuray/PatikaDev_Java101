package Java101_Temel_Kavramlar_Pratikler;
import java.util.Scanner;

public class kdv_tutari_hesaplama {
    public static void main(String[] args) {
        double bazFiyat;
        double kdvliFiyat;
        double kdv;
        Scanner giris = new Scanner(System.in);

        System.out.println("KDV'si hesaplanacak değeri giriniz:");
        bazFiyat= giris.nextDouble();

        if (bazFiyat>0 && bazFiyat<=1000) {
            kdv = (bazFiyat/100)*18;
            kdvliFiyat=bazFiyat+kdv;

            System.out.println("KDV'siz fiyat:" + bazFiyat);
            System.out.println("KDV'li fiyat:" + kdvliFiyat);
            System.out.println("KDV Tutarı:" + kdv);
        } else if (bazFiyat>1000) {
            kdv = (bazFiyat/100)*8;
            kdvliFiyat=bazFiyat+kdv;

            System.out.println("KDV'siz fiyat:" + bazFiyat);
            System.out.println("KDV'li fiyat:" + kdvliFiyat);
            System.out.println("KDV Tutarı:" + kdv);
        } else {
            System.out.println("YANLIŞ DEĞER GİRDİNİZ!");
        }

    }
}
