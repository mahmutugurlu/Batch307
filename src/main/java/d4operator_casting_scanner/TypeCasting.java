package d4operator_casting_scanner;

public class TypeCasting {

    public static void main(String[] args) {

    /*Sayisal primitive data tiplerinin birbirine donusturulmesine Type Casting denir
    Numeric (sayisal) Data Type ==> byte - short - int - long - float - double */

    /*Not 1: Kucuk data type'larini buyuk data type'larina cevirmeyi Java otomatik olarak yapabilir.
    Bu isleme "AutoWidening" (Otomatik genisletme) denir*/

        /*Not 2: Buyuk data type'larini kucuk data type'larina cevirmek riskli bir istir. Veri kaybi olusabilir.
Java bu isi otomatik olarak yapmaz. Bu islemi kod yazanlar yapar.
Bu isleme "Explicit Narrowing"(Aciktan Daraltma)denir.*/

        //Ornek 1: byte data type' ini int data type'ina ceviriniz.
        //Example 1: Convert byte data type to int data type.

        byte age = 13;
        int ageInt = age;

        //Ornek 2: int data type’ ini short data type’ ina ceviriniz.
        //Example 2: Convert int data type to short data type.

        int weight = 313;
        short weightShort = (short)weight; //Typecastingte dönüstürmek istedigimiz data türünü degiskenin önüne yazariz
        System.out.println(weightShort);

        /* not : int ve float 4 byte olmasina ragmen java floattan int e AutoWidening yapmaz. Ama int ten floata yapar
        ayni sekilde long ve double da 8 byte dir. ama java long dan double a AutoWidening yaparken, double dan longa yapmaz.
        veri kaybini engellemek icin böyle yapar.

         */




    }





}
