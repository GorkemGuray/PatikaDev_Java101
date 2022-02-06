package Java101_Kosullu_Ifadeler_Pratikler;

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {

        String userName, password, wrongPassword,newPassword;
        String hardCodedPassword = "java123";
        int secim;

        Scanner inp = new Scanner(System.in);
        Scanner inp2 = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız:");
        userName = inp.nextLine();

        System.out.print("Şifreniz:");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals(hardCodedPassword)) {
            System.out.println("Giriş Yaptınız !");
        } else {
            wrongPassword = password;
            System.out.println("Bilgileriniz yanlış!");
            System.out.println("Şifrenizi Sıfırlamak İster Misiniz");
            System.out.println("Biliyorum çok aptalca ama böyle istedi hoca");
            System.out.println("1-Evet\n2-Hayır");
            secim = inp2.nextInt();

            switch (secim){
                case 1:
                    System.out.print("Yeni şifreyi giriniz:");
                    newPassword = inp.nextLine();

                    while ((newPassword.equals(wrongPassword) || newPassword.equals(hardCodedPassword))==true) {
                        System.out.println("Şifre oluşturulamadı lütfen başka şifre giriniz");
                        newPassword = inp.nextLine();
                    }

                    if ((newPassword.equals(wrongPassword) && newPassword.equals(hardCodedPassword))==false) {
                    System.out.println("Şifre oluşturuldu");
                    hardCodedPassword=newPassword;
                } else {
                        System.out.println("Bu satırı görüyürsan Fucked-Up!");
                    }

                    break;

                case 2:
                    System.out.println("Programdan çıkılıyor...");
                    break;

                default:
                    System.out.println("Yanlış seçim yaptınız, programdan çıkılıyor...");



            }


        }




    }
}
