package java_cod_exercise_sharing;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays12 {
    public static void main(String[] args) {
        // 12. soru: bir Arrayde istenen sayının varlığını kontrol eden kodu yaziniz.

        int numbers []= {2, 45, 87, 56, 109, 0};
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi=input.nextInt();

        Arrays.sort(numbers);//{0 ,2 ,45 ,56 ,87 ,109 }

        int sonuc = Arrays.binarySearch(numbers,sayi);

        if (sonuc>=0){
            System.out.println("Aradığınız sayı bulunmaktadır.");
        } else {
            System.out.println("Aradığınız sayı bulunmamaktadır.");
        }





    }

}

