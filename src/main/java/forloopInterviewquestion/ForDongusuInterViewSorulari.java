package forloopInterviewquestion;

import java.util.Scanner;


        public class ForDongusuInterViewSorulari
        {
            public static void main(String[] args)
            {
                Scanner input = new Scanner(System.in);

                //-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-
    /*
      Soru 6) Interview Question
      Kullanicidan 100'den kucuk bir tamsayi isteyin.
      1'den başlayarak girilen sayiya kadar tum sayilari yazdirin.
      Ancak;
      -şayi 3'un kati ise şayi yerine "Java" yazdirin.
      -şayi 5'in kati ise şayi yerine "Güzeldir" yazdirin.
      -şayi hem 3'un hem 5'in kati ise şayi yerine "Java Güzeldir" yazdirin.
    */

                //     System.out.println("100'den küçük, 0'dan büyük bir sayı giriniz");
                //     byte sayi1 = input.nextByte();
                //     boolean ucunKatiMi, besinKatiMi;
                //     String mesaj1 = "", kelimeJava = "Java", kelimeGuzeldir = "Guzeldir";
                //
                //     if(sayi1 < 100 && sayi1 > 0)
                //     {
                //       for(int i = 1; i < sayi1; i++)
                //       {
                //         ucunKatiMi = i % 3 == 0;
                //         besinKatiMi = i % 5 == 0;
                //
                //         if(ucunKatiMi && besinKatiMi)
                //           mesaj1 = kelimeJava + " " + kelimeGuzeldir;
                //         else if(ucunKatiMi)
                //           mesaj1 = kelimeJava;
                //         else if(besinKatiMi)
                //           mesaj1 = kelimeGuzeldir;
                //         else
                //           mesaj1 = i + "";
                //
                //         System.out.println(mesaj1);
                //       }
                //     }
                //     else
                //       System.out.println("Sayı 100'den küçük olmalı ve 0'dan büyük olmalı.");

                //-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-
                //     Soru 7 ) Interview Question Kullanicidan bir String isteyin ve Stringi tersten yazdirin.

                //     String char dizisidir. Dizilerin index'i 0'dan başlar.

                //     System.out.println("Bir cümle giriniz.");
                //     String cumle1 = input.nextLine();
                //     String cumle2 = "";
                //
                //     for(int i = cumle1.length() - 1; i > -1; i--)
                //     {
                //       cumle2 += cumle1.substring(i, i+1);
                //     }
                //
                //     System.out.println(cumle2);

                //-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-
                // /Soru 8 ) Interview Question Kullanicidan bir String isteyin ve Stringi tersine ceviren bir method yazin.

                //     System.out.println("Bir cümle giriniz.");
                //     String cumle5 = input.nextLine();
                //     String cumle3 = stringTersCevir(cumle5);
                //     System.out.println(cumle3);

                //-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-
                //Soru 9 ) Interview Question Kullanicidan bir String isteyin.
                // Kullanicinin girdigi String'in palindrome olup olmadigini kontrol eden bir program yazin.

                //     System.out.print("Bir kelime giriniz : ");
                //     String kelime1 = input.next();
                //     String kelime2 = "";
                //
                //     for(int i = kelime1.length() - 1; i > -1; i--)
                //     {
                //       kelime2 += kelime1.charAt(i);
                //     }
                //
                //     if(kelime1.equalsIgnoreCase(kelime2))
                //       System.out.println("Kelimeler palindromdur");
                //     else
                //       System.out.println("Kelimeler palindrom değildir");

                //-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-
    /*
      Soru 10 ) Kullanicidan iki şayi isteyin. Girilen sayilar ve aralarindaki tum tamsayilari
      toplayip, sonucu yazdiran bir program yaziniz
    */

                //     System.out.println("İki tane sayı giriniz.");
                //     System.out.print("1. sayı : ");
                //     int sayi2 = input.nextInt();
                //     System.out.print("2. sayı : ");
                //     int sayi3 = input.nextInt();
                //     int toplam1 = 0;
                //
                //     if(sayi2 <= sayi3)
                //       toplam1 = tumSayilariTopla(sayi2, sayi3);
                //     else if(sayi3 < sayi2)
                //       toplam1 = tumSayilariTopla(sayi3, sayi2);
                //
                //     System.out.println("Sayı2 + Sayı3 = " + toplam1);

                //-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-
    /*
      Soru 11 ) Interview Question Kullanicidan 10'dan kucuk bir tamsayi isteyin ve girilen
      sayinin faktoryel'ini bulun.
    */

                //     System.out.println("10'dan küçük bir sayı girin.");
                //     int sayi4 = input.nextInt();
                //     if(sayi4 > 10 && sayi4 < 1)
                //     {
                //       System.out.println("Girilen sayı 10'dan büyük veya 1'de küçük olduğu için sayı 10 yapıldı");
                //       sayi4 = 10;
                //     }
                //
                //     for(int i = sayi4 - 1; i > 0; i--)
                //     {
                //       sayi4 *= i;
                //     }
                //
                //     System.out.println("Girilen sayının faktoriyeli : " + sayi4);
            }

            // Soru 10'da kullanılan metod
            private static int tumSayilariTopla(int kucukSayi, int buyukSayi)
            {
                int toplam = 0;
                for(int i = kucukSayi; i <= buyukSayi; i++)
                {
                    toplam += i;
                }
                return toplam;
            }

            // Soru 8'de kullanılan metod
            public static String stringTersCevir(String cumle)
            {
                String terCumle = "";
                for(int i = cumle.length() - 1; i > -1; i--)
                {
                    terCumle += cumle.substring(i, i + 1);
                }

                return terCumle;
            }
        }

    

