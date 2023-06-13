package sorubankasi_channel;

import java.util.Scanner;

public class Bilethesaplama {
    public static void main(String[] args) {
        /*
   A şehrinden uçmak isteyen bir yolcu B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
   Bilet tarifesi:
   km birim fiyati : 0.10$
   yolcu 12 yasindan kucukse toplam fiyat %50 indirim,
   12 ve 24 yas arasindaysa 10% indirim,
   65 yasindan buyukse 30% indirim,
   bilet gidis donus alinirrsa 20% indirim uygulayan bi app create ediniz
*/  /* */
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen gitmek istediğiniz şehri seçiniz \n B şehri \n C sehri \n D sehri");
        String sehir = input.nextLine();

        int sart=0;
        do {
            if (sehir.equalsIgnoreCase("b") || sehir.equalsIgnoreCase("c") ||sehir.equalsIgnoreCase("d")) {
                break;
            }else {
                sart++;
                System.out.println("Hatalı giris yaptınız, tekrar deneyiniz");
                sehir = input.nextLine();
            }
        }while (sart!=0);

        System.out.println("lütfen tek yon yada gidiş dönüş olduğunu belirtiniz.-- tek yon ise 't' ye -- gidis donus ise 'gd' yazınız");
        String yon= input.nextLine();
        /**/
        int sartb=0;
        do {
            if (yon.equalsIgnoreCase("t")||yon.equalsIgnoreCase("gd")){
                break;
            }else {
                sartb++;
                System.out.println("hatalı giriş yaptınız . tekrar deneyiniz.");
                yon= input.nextLine();
            }
        }while (sartb!=0);

        System.out.println("lütfen yaşınızı giriniz...");
        int yas= input.nextInt();
// mesafe hesaplama
        int mesafe=0;    //mesafeyi hesaplayabilmek için bos bir  sepet oluşturduk
        if (sehir.equalsIgnoreCase("b")) {
            mesafe = 500; // kullanıcı b girisi yaparsa mesafe sepetine 500 eklenecek
        } else if (sehir.equalsIgnoreCase("c")) {
            mesafe = 700; // kullanıcı c girisi yaparsa mesafe sepetine  700 eklenecek
        } else if (sehir.equalsIgnoreCase("d")) {
            mesafe = 900; // kullanıcı d girişi yaparsa mesafe sepetine 900 eklenecek
        }
        double birimfiyat = 0.10;  // km başı ödeyeceğimiz tutar 0.10$
        double bilet = mesafe * birimfiyat;// her bir km mesafeyi 0.10 ile carpacgiz ve bilet fiyatını hesaplayacağız


// yasa göre indirim oranı hesaplama
        double indirimOrani = 0; // yasa göre indirimi bulmak için boş bir indirimOranı sepeti oluşturduk.
        if (yas>0&& yas <= 12) {   //eğer yolcu 12 yasında ise
            indirimOrani =0.50;  //indirim oranımız bilet fiyatından %50 indirimli olsun
            System.out.println("cocuk tarifesinden ödeme yapacaksınız." + indirimOrani + " kadar indirim uygulanacak" );
        } else if (yas > 12 && yas <= 24) {  // eğer 12 ve 24 yas aralığında iseniz
            indirimOrani = 0.10;  //indirim oranımız bilet fiyatından %10 indirimli olsun
            System.out.println("genc tarifesinden ödeme yapacaksınız. " + indirimOrani + " kadar indirim uygulanacak");
        } else if (yas>24&&yas<65) {  // 24 ve 65 yas aralığına indirim uygulanmıyor
            indirimOrani=0;
            System.out.println("24-65 yas aralığına herhangi bir indirimimiz bulunmamaktadır");
        } else if (yas >= 65) {  // eğer 65 yasndan büyük iseniz
            indirimOrani =0.35;  //indirim oranımız bilet fiyatından %35 indirimli olsun
            System.out.println("öldüm fiyattan ödeme yapacaksiniz. sanslısınız :) " + indirimOrani+ " kadar indirim uygulanacak");
        }
        double  indirimliFiyat=bilet-(bilet*indirimOrani); //bilet fiyatından yasa göre indirim yaptık ve indiri
        System.out.println("indirimli fiyatınız: "+ indirimliFiyat+"$");

//gidiş dönuş hesaplama
        double gidisDonusIndirimi = 0;
        if (yon.equalsIgnoreCase("gd")) {  // eger yon sorusuna gd cevabını veren olursa
            gidisDonusIndirimi =indirimliFiyat- (indirimliFiyat * 0.10);  //mevcut yaş indirimlerinden sonra birde %10 gd indiri yopılsın
            System.out.println("gidis donus bileti aldığınız için " + gidisDonusIndirimi +"$"+" olarak ödeme yapacaksınız");
        }

    }
}
