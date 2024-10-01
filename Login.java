import java.util.Scanner;
/*
- Kullanıcı Girişi
Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği
ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip ,
şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz.
" sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
 */

public class Login {
    public static void main(String[] args) {

        String passWord = "0505";
        String userName = "taha yasin";
        String newPassword;
        Scanner scan = new Scanner(System.in);

        System.out.print("Lutfen Adinizi Giriniz:");
        userName = scan.nextLine();

        System.out.print("Sifrenizi Giriniz:");
        passWord = scan.nextLine();

        if (userName.equals("taha yasin") && passWord.equals("0505")) {

            System.out.println("Giris Yapildi...");

        } else {
            System.out.println("Sifreniz Yanlis ! Sifrenizi Degistirmek İcin 1'e Cikmak icin 2'ye Basiniz:");
            int choice = scan.nextInt();

            if (choice == 1) {
                scan.nextLine();
                System.out.println("Yeni Sifre Giriniz:");
                newPassword = scan.nextLine();
                if (newPassword.equals("0505")) {
                    System.out.println("Sifre Olusturulamadi. Lütfen Baska Sifre Giriniz: ");
                } else {
                  
                    System.out.println("Sifreniz Basari İle Olusturuldu...");
                }
            }

            else {
                System.out.println("Cikiliyor...");
            }

        }

    }

}
