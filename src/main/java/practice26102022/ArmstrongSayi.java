package practice26102022;

import java.util.Scanner;

public class ArmstrongSayi {
    /*
   Bir sayı, her basamağının küpünün toplamına eşitse Armstrong sayısı olarak adlandırılır.
   Örneğin, 153, her basamağın küpüne eşit olan 153= 1 + 125 + 27 olduğundan bir
   Armstrong sayısıdır. Verilen numaranın Armstrong sayısı olup olmadığını kontrol etmek
   için bir kod yazınız.
*/


        public static void main(String[] args) {
            Scanner input =  new Scanner(System.in);
            System.out.println("Armstron sayisi olup olmadigini kontrol etmek icin bir tam sayi girniz");

            int n = input.nextInt();

            int sumOfCubes = 0;
            int temp =n;
            int digit =0;
            while(n>0){

                digit= n%10;

                sumOfCubes = sumOfCubes+ digit*digit*digit;//125+27+1=153

                n= n/10;
            }

            if(temp ==sumOfCubes){
                System.out.println(temp + "  Amstrong sayisidir " );
            }else{
                System.out.println(temp + "  Amstrong sayisi degildir " );
            }

        }
    }

