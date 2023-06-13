package java_cod_exercise_sharing;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays1ve3 {
    public static void main(String[] args) {
        /*
       Task->1 Verilen  bir arrayin tum elemanlarini
        bir soldaki konuma print eden code create ediniz
       input:  [1,2, 3]
        output [2, 3, 1]
        */

        int arrSayı[] = new int[3];
        int yeniArr[] = new int[3];
        for (int i = 0; i < arrSayı.length; i++) {
            arrSayı[i] = i;
        }
        System.out.println(Arrays.toString(arrSayı));

        for (int i = 0; i < arrSayı.length; i++) {
            if (i == 0) {
                yeniArr[i] = arrSayı[i + 1];
            } else if (i == arrSayı.length - 1) {
                yeniArr[i] = arrSayı[0];
            } else {
                yeniArr[i] = arrSayı[i + 1];
            }




        }
        System.out.println(Arrays.toString(yeniArr));

        // Task->2 girilen int değeri tersten print eden code create ediniz.

        Scanner sc=new Scanner(System.in);
        System.out.println("agam kac elemanlı array istiyirsen: ");
        int arrBoyut=sc.nextInt();

        int arr[]=new int[arrBoyut];
        for (int i = 0; i < arrBoyut; i++) {
            System.out.print(i + ".index elemanı giriniz : ");
            arr[i]=sc.nextInt();

        }
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

        Arrays.sort(arr);// k->b sıralandı

        for (int i = arr.length-1 ; i>=0 ; i--) {
            System.out.println("arr[i] = " + arr[i]);

        }

        // Task->3 verilen bir int arrayi elemanlrını buyukten kucuge siralayip return eden METHOD create ediniz

        int arry[]= {3,5,6,1,9,45,25,4,9,0};

        sırala(arry);


    }

    private static void sırala(int[] arry) {
        Arrays.sort(arry);
        System.out.println("Arrays.toString(arry) = " + Arrays.toString(arry));
        for (int i = arry.length-1; i >=0 ; i--) {
            System.out.println("arry[i] = " + arry[i]);
        }



    }

}
