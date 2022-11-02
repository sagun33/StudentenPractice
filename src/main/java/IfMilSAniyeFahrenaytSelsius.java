import java.util.Scanner;

public class IfMilSAniyeFahrenaytSelsius {

    public static void main(String[] args) {
        /*
    Mili km'ye, saniyeyi saate, fahrenhaytı santigrata çeviren bir dönüştürücü oluşturmak için kod yazınız.
     Google'dan dönüşümler için formülleri bulunuz.
    a) Kullanıcı mile değerini 10 ve operatorü mildenKmye olarak girdiğinde, konsolda kodunuz "16 km" yazmalıdır (sayı dinamik olacak)
    b) Kullanıcı saniye değerini 7200 ve operatorü saniyedenSaate olarak girdiğinde, konsolda
    kodunuz "2" yazmalıdır (sayı dinamik olacak)
    c) Kullanıcı fahrenheit değerini 83 ve operatorü fahrenaytdanSantigarata olarak girdiğinde,
    konsolda kodunuz "28.3333 santigrat" yazmalıdır (sayı dinamik olacak)

     */
        Scanner input = new Scanner(System.in);
        System.out.println("Mil dönüştürmek için 1, Saniye dönüştürmek için 2, Fahrenheit dönüştürmek için 3'e basınız");
        int secim2 = input.nextInt();
        if (secim2 == 1) {
            System.out.print("Mil'i dönüştürmek için değer giriniz: ");
            double mil = input.nextDouble();
            double mildenKmye = 1.60934 * mil;//bir mil= 1,60934 kilometredir.
            System.out.println("Girdiginiz mil degeri : "+mildenKmye +" km'dir.");
        } else if (secim2 == 2) {
            System.out.print("Saniye'yi dönüştürmek için değer giriniz: ");
            int saniye = input.nextInt();
            int saniyedenSaate = saniye / 3600;
            System.out.println("Girdiginiz saniye degeri : "+saniyedenSaate+ "  saat'dir.");
        } else if (secim2 == 3) {
            System.out.print("Fahrenheit'ı dönüştürmek için değer giriniz: ");
            double fahrenheit = input.nextDouble();
            double fahrenheitToCelcius =(fahrenheit - 32) / 1.8;
            fahrenheitToCelcius=Math.round(fahrenheitToCelcius);
            System.out.println("Girdiginiz fahrenayt'in degeri : "+fahrenheitToCelcius +" Celcius'dur. ");
        } else {
            System.out.println("Lütfen geçerli bir seçim yapın...");
        }
    }
}


