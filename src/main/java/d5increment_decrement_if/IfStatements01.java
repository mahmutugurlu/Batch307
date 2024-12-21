package d5increment_decrement_if;

public class IfStatements01 {

    public static void main(String[] args) {


        if (7 < 5) {
            System.out.println("condition dogru ise if calisacak");
        }

        //----------------
        if (8 == 4 + 3) {
            System.out.println("condition dogru, if calisti");
        }
        //----------------
        //Ornek 1: Sayi 0 (dahil) ile 10 (haric) arasinda ise ekrana "Rakam" yazdirin.
        //Example 1: If the number is between 0 (included) and 10 (excluded), print "Number" on the screen.

        // ODEV: -1 < num < 10 yazilabilir mi?

        int num = 17;

        if (num > -1 && num < 10) {
            System.out.println("Rakam");
        }

        //------------------
        //Ornek 2: Sayi uc basamakli ise ekrana "Sayi üç basamaklidir" yazdirin.
        //Example 2: If the number is three digits, print "The number is three digits" on the screen.

        int n = 100;

        if (n > 99 && n < 1000) {
            System.out.println("Sayi uc basamaklidir");
        }


        // NOT .: Yazdırma komutları if bloklarının içinde olduğu için, sadece ilgili if koşulu doğru (true) olduğunda bu kodlar çalışır.
        //Koşullar yanlış (false) olduğunda if bloğu tamamen atlanır ve içindeki hiçbir kod çalışmaz.














    }


}
