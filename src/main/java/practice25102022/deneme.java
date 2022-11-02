package practice25102022;

import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("sayi giriniz");
        int a= input.nextInt();
        int fib []=new int[a];
        fib[0]=1;
        fib[1]=1;


        for (int i = 2; i < a; i++) {

            fib[i] = fib[i - 1] + fib[i-2];
            System.out.println(fib[i]);
        }
    }
    }

