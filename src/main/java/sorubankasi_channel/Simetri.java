package sorubankasi_channel;

public class Simetri {
    public static void main(String[] args) {
        //Bir int Dizisinin simetrik olup olmadığını kontrol etmek için bir yöntem yazın.


          /*  int[] dizi1 = {1, 2, 3,3, 2, 1};
             boolean simetrikMi1 =true;

            if (simetrikMi1) {
                System.out.println("simetrikMi1 =  " + " Dizi simetriktir.");
            } else {
                System.out.println("simetrikMi1 = " + " Dizi simetrik değildir.");
            }

            int[] dizi2 = {1, 2, 3, 4, 5};
            boolean simetrikMi2=false;

            if (simetrikMi2) {
                System.out.println("simetrikMi2  = " + " Dizi simetriktir.");
            } else {
                System.out.println("simetrikMi2  = " + " Dizi simetrik değildir.");
            }

           */

        int[] arr = {1, 2, 3,4,5};


        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {


            if (arr[i] == arr[(arr.length - 1) - i]) {


                flag = true;

            } else
                flag = false;

            break;


        }
        System.out.println(flag);
    }
}
