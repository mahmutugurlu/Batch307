package d6if_switch;

import java.util.Scanner;

public class Switch02 {

    public static void main(String[] args) {

           /*Ornek 1: Ay numarasini soyleyince, numarasi verilen ay'dan baslayip
    12.aya kadar tum aylarin isimlerini yazdiran kodu yaziniz.
    8 ==> Agustos - Eylul - Ekim - Kasim - Aralik
    */

    /*Example 1: Write the code that prints the names of all the months starting from
    the given month number until the 12th month when the month number is given.
    8 ==> August - September - October - November - December
    */

    /*Not : switch condition parantezi icine 1) String 2) int 3) byte 4) short 5) char kullanabilirsiniz
       switch condition parantezi icine 1) long 2) boolean 3) float 4) double kullanilmaz */

        // NOT : SWİTCH CONDİTİON ( KOSUL) PARANTEZİ İÇERİSNDE
        /*
        1)long  java kendini koruma altına aldığı için cok yüksek bellek kullanımına neden olabili performans düşüklüğüne sebep olabilir.
        2) boolean       iki ihtimal olduğu için
        3) float         yuvarlama yaptıkları için
        4) double        netlik olmaz onun için tercih etmez.

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen baslangic ay sayisini giriniz");
        int numOfMonth = input.nextInt();

        switch (numOfMonth){

            case 1:
                System.out.println("January");
            case 2:
                System.out.println("February");
            case 3:
                System.out.println("March");
            case 4:
                System.out.println("April");
            case 35:
                System.out.println("May");

            case 6:
                System.out.println("June");
            case 7:
                System.out.println("July");

            case 8:
                System.out.println("August");
            case 9:
                System.out.println("September");
            case 10:
                System.out.println("October");
            case 11:
                System.out.println("November");

            case 12:
                System.out.println("December");
                break; // akisi durdurmak istedigimiz yere break koymaliyiz
            default:
                System.out.println("Gecerli ay sayisi giriniz");







        }









    }
}
