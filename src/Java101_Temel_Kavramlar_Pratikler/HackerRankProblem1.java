package Java101_Temel_Kavramlar_Pratikler;

import java.util.Scanner;

public class HackerRankProblem1 {
    public static void main(String[] args) {
        int miktar;
        long sayi;
        boolean byteOk = false;
        boolean shortOk = false;
        boolean intOk = false;
        boolean longOk = false;

        Scanner numberInput = new Scanner(System.in);

        miktar = numberInput.nextInt();
        for (int i = 0; i < miktar; i++) {
            try {

                sayi = numberInput.nextLong();

                System.out.println(sayi + " can be fitted in:");
                if (sayi >= -128 && sayi <= 127) {
                    System.out.println("* byte");
                    byteOk = true;
                }
                if (sayi >= -32768 && sayi <= 32767) {
                    System.out.println("* short");
                    shortOk = true;
                }
                if (sayi >= -2147483648 && sayi <= 2147483647) {
                    System.out.println("* int");
                    intOk = true;
                }
                if (sayi >= -9_223_372_036_854_775_808L && sayi <= 9_223_372_036_854_775_807L) {
                    System.out.println("* long");
                    longOk = true;
                }

                if (byteOk == false && shortOk == false && intOk == false && longOk == false) {
                    System.out.println(sayi + " can't be fitted anywhere.");
                }


            } catch (Exception e) {
                System.out.println(numberInput.next() + " can't be fitted anywhere.");
            }

            if (byteOk==false)
                System.out.println("test");

        }//for


    }
}
