package Java101_Temel_Kavramlar_Pratikler;

import java.util.Scanner;

public class DaireAlani {
    public static void main(String[] args) {
        double r, aci,alan;
        float pi=3.14f;

        Scanner girisDaire = new Scanner(System.in);

        System.out.print("Yarıçap : ");
        r=girisDaire.nextDouble();

        System.out.println("--------------------");

        System.out.print("Merkez Açısı : ");
        aci=girisDaire.nextDouble();

        alan = (pi*r*r*aci)/360;

        System.out.println("***********************************");
        System.out.println("ALAN=" + alan);
        System.out.println("***********************************");



    }
}
