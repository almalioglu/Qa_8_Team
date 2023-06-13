package sorubankasi_channel;

import java.util.Scanner;

public class PizzaMakinasi {

        /*
    Bir Pizza Makinasi aplicasyonu yapiniz.

1 - Boyut Seçimi:
    Kullanıcıya boyut seçeneklerini ve ucretlerini gösterin (büyük, orta, küçük).
    Kullanıcıdan bir boyut seçmesini isteyin.
    Seçilen boyutun göre bir standart fiyatlari =>
    kucukBoy=25;
    ortaBoy =30;
    buyukBoy =35;
    kullanici boyut secimi ve ucretini console da gorsun.

2 -Hamur Seçimi:
    Kullanıcıya hamur seçeneklerini ve ucretlerini gösterin (ince, orta)
    Kullanıcıdan bir hamur seçmesini isteyin.
    Seçilen hamura göre bir fiyat ==>
    inceHamurFiyat = 5;
    ortaHamurFiyat = 7;
    kullanici hamur tipini ve ucretini konsolda gorsun

3 -Malzeme Ekleme:
    Kullanıcıya malzeme seçeneklerini veucretlerini gösterin (kasar, sucuk, mantar)
    Malzeme listeleyin Kullanici Maximum 3 adet malzeme akleyebilir.
    Eklenen malzemeleri fiyata ilave edin.
    ekstrasucuk = 8;
    ekstraKasar = 5;
    mantar = 6;
    ilave edildikten sonra kullanici toplam malzeme tutarini consolda gorsun

4 - Toplam Fiyat Hesaplama Fis Detayi:
    Toplam fiyatı hesaplayın ve kaydedin.
    Pizza Bilgilerini Secim bilgilerini Gösterin
    Toplam fiyatı ekrana yazdırın.(Odenecek Tutar)
​
 5-Cikis
    programı sonlandırın.

    Bu adımları takip ederek, kullanıcıya pizza boyutu, hamur tipi ve malzemelerin seçimini
    yapma imkanı sağlayan ve toplam fiyatı hesaplayan bir pizza makinesi oluşturalim
    */

        Scanner input = new Scanner(System.in);
        int secenek;
        int kucukBoy = 25;
        int ortaBoy = 30;
        int buyukBoy = 35;
        int boyutFiyat;
        String pizzaBoyut;

        public void boyutSec () {
            System.out.println("Lutfen pizzanizin boyutunu seciniz." +
                    "\nKucuk boy icin  =  25 tl  ==>  1" +
                    "\nOrta boy icin   =  30 tl  ==>  2" +
                    "\nBuyuk boy icin  =  35 tl  ==>  3" +
                    "\ngiriniz" );

            secenek = input.nextInt();
            switch (secenek) {
                case 1:
                    boyutFiyat = kucukBoy;
                    pizzaBoyut = "Kucuk Boy";
                    break;
                case 2:
                    boyutFiyat = ortaBoy;
                    pizzaBoyut = "Orta Boy";
                    break;
                case 3:
                    boyutFiyat = buyukBoy;
                    pizzaBoyut = "Buyuk Boy";
                    break;
                default:
                    System.out.println("Hatali giris yaptiniz Tekrar deneyiniz.");
                    boyutSec();
            }
            System.out.println("Seciminiz" + pizzaBoyut + boyutFiyat);
        }

        int inceHamurFiyat = 5;
        int ortaHamurFiyat = 7;
        int hamurTipiFiyat;
        String hamurTipi;
        public void hamurTipiSec () {
            System.out.println("Lutfen pizzanizin hamur tipini seciniz." +
                    "\nInce hamur icin              = 5 tl         ==>   1" +
                    "\nOrta kalinlikta hamur icin   = 7 tl         ==>   2" +
                    "\ngiriniz");
            secenek = input.nextInt();

            if (secenek == 1) {
                hamurTipi = "Ince Hamur";
                hamurTipiFiyat = inceHamurFiyat;
            } else if (secenek == 2) {
                hamurTipi = "Orta Hamur";
                hamurTipiFiyat = ortaHamurFiyat;
            } else {
                System.out.println("Hatali giris yaptiniz Tekrar deneyiniz.");
                hamurTipiSec();
            }
            System.out.println("Seceminiz ==> " + hamurTipi + "= " + hamurTipiFiyat);
        }

        int ekstrasucuk = 8;
        int ekstraKasar = 5;
        int mantar = 6;
        int sayac;
        int toplamMalzemeFiyati;

        public void malzemeEkle () {
            System.out.println("Malzeme Listesi" +
                    "\nEkstra Sucuk    = 8 tl               ==> 1" +
                    "\nEkstra Kasar    = 5 tl               ==> 2" +
                    "\nMantar          = 6 tl               ==> 3" +
                    "\nSiparisi tamamlamak icin             ==> 4" +
                    "\ngiriniz");

            do {
                System.out.println("Seciminizi yapiniz");
                secenek = input.nextInt();
                switch (secenek) {
                    case 1:
                        toplamMalzemeFiyati += ekstrasucuk;
                        sayac++;//her malzemeyi 1 kere secebimek icin
                        break;
                    case 2:
                        toplamMalzemeFiyati += ekstraKasar;
                        sayac++;
                        break;
                    case 3:
                        toplamMalzemeFiyati += mantar;
                        sayac++;
                        break;
                    case 4:
                        sayac = 3;
                        break;
                    default:
                        System.out.println("Hatali giris yaptiniz Tekrar deneyiniz.");

                }

            } while (sayac < 3);
            System.out.println("Eklenen Malzeme toplam Fiyati ==>" + toplamMalzemeFiyati);
        }

        public void odemeYap () {
            System.out.println("Toplam Odenecek Tutar = " + (boyutFiyat + hamurTipiFiyat + toplamMalzemeFiyati));
            System.out.println("Onayliyorsaniz ==>1\n" +
                    "Cikis icin ==> 0 \ngiriniz");
            secenek = input.nextInt();
            switch (secenek) {
                case 1:
                    System.out.println("Odeme isleminiz Gerceklesmistir.Pizzaniz Hazirdir.Afiyet olsun.");
                    cikis();
                    break;
                case 0:
                    cikis();
                    break;
                default:
                    System.out.println("Hatali giris yaptiniz Tekrar deneyiniz.");
                    break;
            }

        }

        public void cikis () {
            System.out.println("Bizi Tercih Ettiniginiz icin Tesekkur ederiz.Yine Bekleriz.");

        }
    }

