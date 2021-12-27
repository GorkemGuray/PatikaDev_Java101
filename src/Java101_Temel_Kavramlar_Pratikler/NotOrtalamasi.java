package Java101_Temel_Kavramlar_Pratikler;
import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        int notMatematik, notFizik, notKimya, notTurkce, notTarih, notMuzik;
        double ortalama;
        String sonuc;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunu giriniz:");
        notMatematik= input.nextInt();

        System.out.print("Fizik notunu giriniz:");
        notFizik= input.nextInt();

        System.out.print("Kimya notunu giriniz:");
        notKimya= input.nextInt();

        System.out.print("Turkçe notunu giriniz:");
        notTurkce= input.nextInt();

        System.out.print("Tarih notunu giriniz:");
        notTarih= input.nextInt();

        System.out.print("Müzik notunu giriniz:");
        notMuzik= input.nextInt();

        ortalama = (notMatematik+notFizik+notKimya+notTurkce+notTarih+notMuzik)/6;

        sonuc = ortalama>60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";

        System.out.println(sonuc);
        System.out.println("Ortalama:" + ortalama);





    }
}
