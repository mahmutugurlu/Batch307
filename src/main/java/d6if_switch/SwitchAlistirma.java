package d6if_switch;

import java.util.Scanner;

public class SwitchAlistirma {

    public static void main(String[] args) {

        //Ornek 1: Gun isimlerini verince kacinci gun oldugunu yazdiran kodu yaziniz.
        //   Sunday==>1  . . .  Saturday==>7

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir gun ismi yaziniz");

        String dayName = input.next();

        switch (dayName.toLowerCase()){

            case "sunday" :
                System.out.println(1);
                break;

            case "monday" :
                System.out.println(2);
                break;

            case "tuesday" :
                System.out.println(3);
                break;

            case "wednesday" :
                System.out.println(4);
                break;


            case "thursday" :
                System.out.println(5);
                break;

            case "friday" :
                System.out.println(6);
                break;

            case "saturday" :
                System.out.println(7);
                break;

            default:
                System.out.println("Gecerli bir gun ismi yaziniz");
        }


             /*Ornek 1: Ay numarasini soyleyince, numarasi verilen ay'dan baslayip
        12.aya kadar tum aylarin isimlerini yazdiran kodu yaziniz.
        8 ==> Agustos - Eylul - Ekim - Kasim - Aralik
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ay numarasini yaziniz");

        int monthNum = scanner.nextInt();

        switch (monthNum){
                case 1 :
                System.out.println("January");
                case 2 :
                System.out.println("Februar");
                case 3 :
                System.out.println("March");
                case 4 :
                System.out.println("April");
                case 5 :
                System.out.println("May");
                case 6 :
                System.out.println("Juni");
                case 7 :
                System.out.println("Juli");
                case 8 :
                System.out.println("August");
                case 9 :
                System.out.println("September");
                case 10 :
                System.out.println("October");
                case 11 :
                System.out.println("November");
                case 12 :
                System.out.println("December");
                break;
            default:
                System.out.println("Gecerli bir numara giriniz");


        }

         /*Ornek 1:  Kullanıcıdan bir ay numarası girmesini isteyin (1 ile 12 arasında).
    Girilen ay numarasına göre mevsimi belirleyen ve sonucu konsola yazdıran bir program yazınız.*/

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Lutfen bir ay numarasini giriniz");

        int monthNum2 = scanner2.nextInt();
        String season = switch (monthNum2){
            case 12 ,1 ,2 -> "Kis";
            case 3 ,4 ,5 -> "Ilkbahar";
            case 6 ,7 ,8 -> "Yaz";
            case 9 ,10 ,11 -> "Sonbahar";
            default -> "Bilinmeyen ay";

        };
        System.out.println(season);


    }
}
