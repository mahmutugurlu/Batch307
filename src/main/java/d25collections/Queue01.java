package d24collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queue01 {

    public static void main(String[] args) {

        /* Java'da Queue, verilerin belirli bir düzen içinde saklandığı ve işlendiği bir veri yapısıdır.
        Ilk giren ilk çıkar (FIFO-first in first out) prensibine dayanır, yani ilk eklenen obje ilk çıkarılır.
        Queue, sıralı işlemler ve verilerin işlenmesi için kullanılır. Araya eleman eklemek mümkün değildir.

        Gerçek dünyadan birkaç örnek:
     Sıra Kuyruğu (Queue): Sıra bekleyenlerin önünde olan kişi önce hizmet alır. Bir örnek olarak,
         bir fast-food restoranındaki siparişlerin işlenmesini düşünebilirsiniz.
         İlk gelen sipariş, ilk hazırlanan ve teslim edilen sipariştir.
     Bilet Sırası: Bir konser veya etkinlik için bilet almak isteyen kişiler sıraya girerler.
         Biletler, sırayla satılır ve ilk gelen kişi ilk biletini alır.
     Çağrı Sırası: Müşteri hizmetleri çağrı merkezindeki müşteriler, sırayla operatörlere bağlanır.
         İlk çağrı bekleyeni önce konuşur, ardından sıradaki çağrı alınır.
     Dosya İşleme: Bilgisayar işletim sistemleri ve uygulamalar, dosyaları sırayla işlerler.
         Bir dosya işlem tamamlandığında, sıradaki dosya işlenir.

    Kuyruğun çalışma mantığı, elemanların kuyruğun sonuna eklenip başından çıkarılması şeklinde gerçekleşir.
    Queue, sıralı işlemler veya veriler gerektiğinde kullanışlıdır.

    Queue interface'i, LinkedList ve PriorityQueue gibi farklı class'lar tarafından uygulanabilir.*/

        //Queue nasil olusturulur?

        Queue<String> storage = new LinkedList<>();

        //Queue'ya nasil eleman eklenir?
        //1)add(): Belirtilen öğeyi kuyruğa ekler.

        storage.add("sut");
        storage.add("et");
        storage.add("yumurta");
        storage.add("peynir");

        System.out.println(storage); //[sut, et, yumurta, peynir] -insertion order- girilen siraya göre siraladi

        //Queue<String> storage = new LinkedList<>(); burada storage Queue'mudur yoksa LinkedList'midir?
        //Hangisini metotlarini kullanabilir






    }


}
