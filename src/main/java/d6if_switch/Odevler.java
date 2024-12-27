package d6if_switch;

import java.util.Scanner;

public class Odevler {

    public static void main(String[] args) {



        /*
        TASK :
       Kullanicidan bir sayi aliniz
       Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
       10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
       Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");

        int sayi = input.nextInt();

        if (sayi >= 0 && sayi < 10) {
            System.out.println("Rakam");


        } else if (sayi >= 10) {
            System.out.println("Pozitif Sayi");
        } else {
            System.out.println("Negatif sayi");
        }


    }


}




