package java_sorubankasi;


import java.util.Arrays;

public class StaticBlockArrays {
    public static void main(String[] args) {
        //4.Soru

        int arr[]={2,11,0,23,7};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[0, 2, 7, 11, 23]

        for (int i = 4; i >=0 ; i--) {
            System.out.print(arr[i]+" ");// B) 23 11 7 2 0
        }



    }

    }


