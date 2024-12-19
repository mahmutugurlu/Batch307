package d4operator_casting_scanner;

import java.util.Scanner;

public class Scanner05 {

    public static void main(String[] args) {

        //Ornek 5: Kullanicidan alacaginiz 5 basamakli bir sayinin ilk iki ve son iki basamagindaki
        //rakamlarin toplamini yazdiran kodu yaziniz.

        //Example 5: The first two and last two digits of a 5-digit number you will receive from the user.
        //Write the code that prints the sum of the numbers
        //           45678 ==> 45 + 78 = 123

        //**Soldan iki basamagi (firstTwoDigits) almak icin 1000’e boleriz
        //Java’da bir tamsayiyi baska bir tamsayiya bolunce sonuc tamsayi cikar.
        // Yuvarlama yapilmaz.Kusuratlar silinir.

        //Bir sayinin birler basamagini almak icin 10'a, onlar ve birler basamagini almak icin 100'e boler, kalani aliriz.
        //% modulus operatorudur. iki parametreli calisir.1.yi 2.ye boler ve kalani verir.
        //Sagdan iki basamagi (lastTwoDigits) almak icin; 100’e boler kalani aliriz.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 5 basamakli bir sayi giriniz : ");
        int num = input.nextInt();

        int firstTwoDigits = num/1000;
        int lastTwoDigits = num % 100; // kalani almak icin % modulus kullaniriz

        System.out.println(firstTwoDigits + lastTwoDigits);



    }



}
