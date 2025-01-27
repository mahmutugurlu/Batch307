package d25collections;

import java.util.HashMap;

public class Maps02 {

    public static void main(String[] args) {

        HashMap<String,Integer> stdAges = new HashMap<>();
        stdAges.put("Ali",18);
        stdAges.put("Can",19);
        stdAges.put("Tom",33);
        stdAges.put("Veli",63);
        stdAges.put("Ahmet",41);

        stdAges.put("Tom", 35);
        System.out.println(stdAges); //{Can=19, Ahmet=41, Tom=35, Veli=63, Ali=18}

        //1) replace() methodu, value'lari key'leri kullanarak update etmeye yarar
        //Aynı işlemi put ile yapmak da teknik olarak işe yarar, ancak replace kullanmak,
        // kodunuzu okuyan diğer geliştiricilere ve size daha net bilgi verir.

        stdAges.replace("Tom",39);
        System.out.println(stdAges); //{Can=19, Ahmet=41, Tom=39, Veli=63, Ali=18} tom un valuesini degistirdik

        //2) replace() methodu, eski deger kontrolu yaparakta calisir

        stdAges.replace("Tom",21,45);
        System.out.println(stdAges);
        //Tom value'su degismez cunku eski deger 21 degil.
        //Örnegin bunu bankacilikta sifre degistirirken eski sifreyi sorarak yeni sifre belirlenmesinde kullanilir.


        stdAges.replace("Tom",39,45);
        System.out.println(stdAges); //{Can=19, Ahmet=41, Tom=45, Veli=63, Ali=18}

        //Degisiklik olacak cunku Tom'un eski value'su 39'du

        //-----------------------------------------------------

        //3)putIfAbsent() metodu, belirtilen key ve value çiftini, key Map'te yoksa Map'e ekler.
        // Key Map'te zaten varsa, metodun hiçbir etkisi olmaz.

        stdAges.putIfAbsent("Tom", 77);
        System.out.println(stdAges);//{Can=19, Ahmet=41, Tom=45, Veli=63, Ali=18}
        //Tom yani key, map'te oldugu icin eklemedi

        stdAges.putIfAbsent("Ayse",23);
        System.out.println(stdAges); //{Can=19, Ahmet=41, Tom=45, Veli=63, Ayse=23, Ali=18}
        //Ayse key'i map'te olmadigi icin, Ayse=23 map'e eklendi

        //putIfAbsent() metotunda key üzerinden kontrol yapar, value ayni olsa bile map e eklenir.


    }
}
