package d8stringmanipulations;

public class StringManipulations04 {

    public static void main(String[] args) {

        //Ornek 1: Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz.
        //String tv = “$456.99”;  String laptop = “$875.99"; ==> 456.99 + 875.99 = 1332.98

        //Example 1: Find the total price of the following products.
        //String tv = “$456.99”; String laptop = “$875.99"; ==> 456.99 + 875.99 = 1332.98

        String tv = "$456.99";

        String laptop = "$875.99";

        tv = tv.replace("$","");

        laptop =laptop.replace("$","");

        Double totalPrice = Double.valueOf(tv) + Double.valueOf(laptop);
        System.out.println(totalPrice);


        //-------------------------------------------------

        //Ornek 2: Kullanici isminin ilk harflerini alip buyuk hale getirerek console'a yazdiriniz.
        //           "       " ==> AC
        //Example 2: Take the first letters of the username, capitalize them and write them to the console.

        //trim() metodu bir String’deki bastaki ve sondaki bosluklari siler. Aradakileri silmez
        //split() String’i istediginiz karakterden parcalamaya yarar.
        //Not: Bir satirda, birden fazla methodu yanyana kullanirsaniz buna “method chain (zincir)” denir


         String name = "  ali cAN Emek ";
         char first = name.trim().toUpperCase().charAt(0);
        System.out.println(first);

        char last = name.trim().toUpperCase().split("\\s+")[0].charAt(0);// spit ile bosluktan sonra ikiye böl ve 1 indexi al dedik
                                                                        //splitle bu ismi iki bölüme ayirdik ve onu indexle saydik, ilk kismi 0
                                                                // ikinci kisim indexte 1 degerini aldi, o yüzden bir yazdik
        System.out.println(last);

        System.out.println("" + first + last); // char sayisal deger verdigi icin string degeri almak icin "" ekledik.

       // \\s+ ifadesi, bir veya daha fazla ardışık boşluk karakterini ifade eder.





    }


}
