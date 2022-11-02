import java.util.Scanner;

public class IfSorusu {
    public static void main(String[] args) {
        /*
            /*
     * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
     * musteri karti olup olmadigini sorun
     * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
     * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
     * alirsa %10 indirim yapan code create ediniz.
                */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen aldiginiz urunun adedini giriniz");
        int adet=scan.nextInt();
        System.out.println("Lutfen aldiginiz urunun liste fiyatini giriniz");
        double fiyat=scan.nextDouble();
        System.out.println("Musteri kartiniz var mi? Varsa Y yoksa N tusuna basiniz");
        char kart=scan.next().toLowerCase().charAt(0);
        double toplamFiyat;
        if(kart=='y'){
            if(adet>10){
                fiyat=fiyat*0.8;//fiyat=fiyat*0.8
                toplamFiyat=fiyat*adet;
                System.out.println("%20 indirim hakki kazandiniz. Toplam odemeniz gereken miktar: "+toplamFiyat+" TL dir");
            }else{
                fiyat*=0.85;
                toplamFiyat=fiyat*adet;
                System.out.println("%15 indirim hakki kazandiniz. Toplam odemeniz gerekn miktar: "+toplamFiyat+" TL dir");
            }


        } else if (kart=='n') {
            if(adet>10){
                fiyat*=0.85;
                toplamFiyat= fiyat*adet;
                System.out.println("%15 indirim hakki kazandiniz.Toplam odemeniz gereken miktar:"+toplamFiyat+" TL dir");
            }else{
                fiyat*=0.9;
                toplamFiyat=fiyat*adet;
                System.out.println("%10 indirim hakki kazandiniz. Toplam odemeniz gereken miktar: "+toplamFiyat+" TL dir");
            }

        }else{
            System.out.println("Yanlis giris yaptiniz. Lutfen tekrar deneyiniz.");
        }


    }
}



