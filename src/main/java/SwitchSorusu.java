import java.util.Scanner;

public class SwitchSorusu {
    public static void main(String[] args) {
            /*
    SORU: Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme, çıkış işlemlerinin yapıldıgı bir
     ATM app. code create ediniz
     */

        Scanner input = new Scanner(System.in);
        System.out.println("     ****    ");
        System.out.println("ATM 'ye hosgeldiniz :-)  ");
        System.out.println("Bakiye sorgulama : 1\nPara cekme : 2\nPara yatirma : 3\ncikis : 4");
        int islem=input.nextInt();
        int bakiye=1000;

        switch(islem){
            case 1:
                System.out.println("Mevcut bakiyeniz: "+ bakiye);
                break;
            case 2:
                System.out.println("Cekeceginiz miktari giriniz: ");
                int cekilenMiktar=input.nextInt();
                if(cekilenMiktar>bakiye || cekilenMiktar<0){
                    System.out.println("Olmayan parayi cekmeye calisiyorsunuz.");
                }else{
                    bakiye-=cekilenMiktar;
                    System.out.println("Bakiyenizin guncel hali :  "+bakiye);
                }
                break;
            case 3:
                System.out.println("Yatiracaginiz miktari giriniz : ");
                int yatirilanMiktar= input.nextInt();
                bakiye+=yatirilanMiktar;
                System.out.println("Bakiyenizin guncel hali : "+bakiye);
                break;
            case 4:
                System.out.println("Cikisiniz yapilmistir. Yine bekleriz :-)");
                break;


        }









    }
}



