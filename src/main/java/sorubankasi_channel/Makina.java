package sorubankasi_channel;

import java.util.Scanner;

public class Makina {
    /*
    Bir Pizza Makinasi aplicasyonu yapiniz.

1 - Boyut Seçimi:
    Kullanıcıya boyut seçeneklerini ve ucretlerini gösterin (büyük, orta, küçük).
    Kullanıcıdan bir boyut seçmesini isteyin.
    Seçilen boyutun göre bir standart fiyatlari =>
    kucukBoy=25;
    ortaBoy =30;
    buyukBoy =35;
    kullanici boyut secimi ve ucretini console da gorsun.*/
    Scanner input =new Scanner(System.in);
    int secenek;
    int kucukBoy=25;
    int ortaBoy=30;
    int buyukBoy=35;
    int pizzaFiyati;
    String pizzaBoyutu;
    public void boyutSecimi(){
        System.out.println("Lutfen istediginiz pizza boyutunu seciniz.." +
                "\nKucuk Boy pizza: 25 TL --> secmek icin 1'e basiniz"+
                "\nOrta Boy pizza: 30 TL --> secmek icin 2'ye basiniz"+
                "\nBuyuk Boy pizza: 35 TL --> secmek icin 3'e basiniz");
       secenek= input.nextInt();
       switch (secenek){
           case 1:
               pizzaBoyutu="Kucuk Boy";
               pizzaFiyati=kucukBoy;break;
           case 2:
               pizzaBoyutu="Orta Boy";
               pizzaFiyati=ortaBoy;break;
           case 3:
               pizzaBoyutu="Buyuk Boy";
               pizzaFiyati=buyukBoy;break; default:
       }
        System.out.println("Secilen pizza : " + pizzaBoyutu +"-->" + " Pizza Fiyati :" +pizzaFiyati);

    }

    /*
2 -Hamur Seçimi:
    Kullanıcıya hamur seçeneklerini ve ucretlerini gösterin (ince, orta)
    Kullanıcıdan bir hamur seçmesini isteyin.
    Seçilen hamura göre bir fiyat ==>
    inceHamurFiyat = 5;
    ortaHamurFiyat = 7;
    kullanici hamur tipini ve ucretini konsolda gorsun*/

    int inceHamurFiyati=5;
    int ortaHamurFiyati=7;
    String secilenHamur;
    int hamurFiyati;
    public void hamurSecimi() {
        System.out.println("Lutfen pizza hamurunu seciniz" +
                "\nİnce Hamur : 5 TL secmek icin 1'e basiniz" +
                "\nOrta Hamur : 7 TL secmek icin 2'ye basiniz");
        secenek = input.nextInt();
        if (secenek == 1) {
            secilenHamur = "İnce Hamur";
            hamurFiyati = inceHamurFiyati;
        } else if (secenek == 2) {
            secilenHamur = "Orta Hamur";
            hamurFiyati = ortaHamurFiyati;
        } else {
            System.out.println("Seceneginiz hatali yeniden seciniz");
            hamurSecimi();
        }
    }

/*
3 -Malzeme Ekleme:
    Kullanıcıya malzeme seçeneklerini veucretlerini gösterin (kasar, sucuk, mantar)
    Malzeme listeleyin Kullanici Maximum 3 adet malzeme akleyebilir.
    Eklenen malzemeleri fiyata ilave edin.
    ekstrasucuk = 8;
    ekstraKasar = 5;
    mantar = 6;
    ilave edildikten sonra kullanici toplam malzeme tutarini consolda gorsun */

    int ekstraSucuk=8;
    int ekstraKasar=5;
    int ekstraMantar=3;
    String eklenenMalzeme=" ";
    int toplamMalzemeFiyati;
    int sayac;
    public void malzemeEkleme(){
        System.out.println("Lutfen eklemek istediginiz malzemeyi seciniz"+
                "\nEkstra Sucuk : 8 TL eklemek icin 1'e basiniz"+
                "\nEkstra Kasar : 5 TL eklemek icin 2'ye basiniz"+
                "\nEkstra Mantar : 3 TL eklemek icin 3'e basiniz"+
                "\nSiparisinizi tamamlamak icin lutfen 4'e basiniz");

       do{
           secenek=input.nextInt();
           switch (secenek){
            case 1:
                eklenenMalzeme += "Ekstra Sucuk,";
                toplamMalzemeFiyati += ekstraSucuk;
                sayac++;break;
            case 2:
                eklenenMalzeme += "Ekstra Kasar,";
                toplamMalzemeFiyati += ekstraKasar;
                sayac++;break;
            case 3:
                eklenenMalzeme +="Ekstra Mantar";
                toplamMalzemeFiyati += ekstraMantar;
                sayac++;break;
            case 4:
                sayac=3;
                break;
                default:
                    System.out.println("Hatali giris yaptiniz Yeniden deneyin");

        }
    }while (sayac<3);
        System.out.println("Eklenen Malzemeler   :" +eklenenMalzeme+
                "\nToplam Malzeme Fiyati  :" +toplamMalzemeFiyati+ "TL");
    }


/*
4 - Toplam Fiyat Hesaplama Fis Detayi:
    Toplam fiyatı hesaplayın ve kaydedin.
    Pizza Bilgilerini Secim bilgilerini Gösterin
    Toplam fiyatı ekrana yazdırın.(Odenecek Tutar)*/

    public void odenecekTutar(){
        System.out.println("Pizzaniz :" +(pizzaBoyutu+secilenHamur+eklenenMalzeme)+
                "\nOdecyeceginiz Toplam Fiyat  :"+(pizzaFiyati+hamurFiyati+toplamMalzemeFiyati));
        System.out.println("Siparisi onaylamak icin 1'e basiniz"+
                "\nİptal etmek icin 0'a basiniz");
      secenek=input.nextInt();
      switch (secenek){
          case 1:
              System.out.println("Odeme isleminiz basariyla gerceklesmistir"+
                      "\nPizzaniz hazirlaniyor..10 dk sonra SERVİS bolumunden alabilirsiniz"+
                      "\nAfiyet seker olsun. Yeniden bekleriz");
              cikis();break;
          case 0:
              cikis();break;
          default:
              System.out.println("Hatali giris,yeniden deneyiniz");break;
      }
    }


    public void cikis() {
        System.out.println("Bizi tercih ettiginiz icin tesekkur ederiz");
    }

    /*

 5-Cikis
    programı sonlandırın.

    Bu adımları takip ederek, kullanıcıya pizza boyutu, hamur tipi ve malzemelerin seçimini
    yapma imkanı sağlayan ve toplam fiyatı hesaplayan bir pizza makinesi oluşturalim
    */
}
