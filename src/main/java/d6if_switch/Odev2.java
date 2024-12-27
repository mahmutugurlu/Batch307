package d6if_switch;

import java.util.Scanner;

public class Odev2 {

    public static void main(String[] args) {

        /*
        TASK :
         Kullanicidan bir character girmesini isteyiniz
         Character harf ise kucuk harf olup olmadigini kontrol ediniz
         Kucuk harf ise ekrana "Kucuk Harf" yazdiriniz
         Buyuk harf ise ekrana "Buyuk Harf" yazdiriniz
         Harf degilse ekrana "Harf degil" yazdiriniz
        97:a  122:z ascii değeri
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");

        char karakter = scanner.next().charAt(0);


        if (karakter >= 'A'&& karakter<='Z') {
            System.out.println("Büyük Harf");
        } else if (karakter >= 'a' && karakter <= 'z') {
            System.out.println("Kucuk harf");

        } else {
            System.out.println("Harf Degil");
        }



                  /*
        TASK :
         Kullanıcıdan bir pozitif tamsayı girmesini isteyin, o pozitif tamsayı 3 basamaklı ise ekrana "3 Basamaklı" yazdırın.
         3 basamaklı degilse çift olup olmadigini kontrol edin. Çift ise "3 basamaklı olmayan çift sayı" yazdırın.
         Çift sayı degilse "3 basamaklı olmayan tek sayı yazdırın."
         */

        Scanner nummer = new Scanner(System.in);
        System.out.println("Pozitif bir sayi giriniz");

        int sayi = nummer.nextInt();

        if (sayi>99 && sayi<1000){
            System.out.println("3 Basamakli pozitif sayi");
        } else if (!(sayi>99 && sayi<1000)&& sayi%2==0) {

        }


    }







}
