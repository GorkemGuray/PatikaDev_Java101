package Java101_Kosullu_Ifadeler_Pratikler;

import java.util.Scanner;

public class HavaSicaklikEtkinlik {
    public static void main(String[] args) {
        int temp;

        Scanner input = new Scanner(System.in);

        System.out.println("Hava Sıcaklığı Nedir?");
        temp = input.nextInt();

        if (temp<5) {
            System.out.println("Kayak");
        }

        if (temp>=5 && temp<15) {
            System.out.println("Sinema");
        }

        if (temp>15 && temp<25) {
            System.out.println("Piknik");
        }

        if (temp>25) {
            System.out.println("Yüzme");
        }

        if (temp==15) {
            System.out.println("Sinema veya Piknik");
        }

        if (temp==25) {
            System.out.println("Piknik veya Yüzme");
        }
    }
}
