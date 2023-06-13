package java_sorubankasi;

public class GrupCalismasi {
    public static void main(String[] args) {
        //soru bankasi 243-1
        // Sadece tek bir kelimeden oluşan şehir isimleri için bir String değişkeni oluşturun. Şehir
        //ismini, baş harfi büyük ve diğer tüm karakterleri küçük harfler olacak şekilde konsolda
        //yazdırınız.
        String sehir = "sIVAS";
        String sehir2 =sehir.trim().toLowerCase();
        System.out.println(sehir2);
        String ilkHarfiBuyuk = sehir2.substring(0,1).toUpperCase();
        System.out.println(ilkHarfiBuyuk +sehir2.substring(1));

        //soru bankasi 243-5
        // Bir String değişkeni oluşturunuz ve String değişkenin konsolda boşluk olmayan son
        //karakteri yazdırınız.
        String a= "Grup calismasi  ";
        int a1= a.trim().length() - 1;



    }
}
