package java_cod_exercise_sharing;

import java.util.Arrays;

public class Arrays13 {
    public static void main(String[] args) {
        /* 13. Soru
         TASK :
         * Input olarak verilen listteki isimlerden
         * icinde 'a' harfi bulunanlari silen bir kodu yaziniz
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */

        String names []={"Ali","Veli","Ayse","Fatma","Omer"};

        int counter=0;
        for (String w:names) {
            if (w.toLowerCase().contains("a")) {
                continue;
            }else {
                counter++;
            }
        }

        String namesYeni []= new String[counter];

        int idx=0;
        for (String w:names) {
            if (w.toLowerCase().contains("a")) {
                continue;
            }else {
                namesYeni[idx]=w;
                idx++;
            }
        }

        System.out.println(Arrays.toString(namesYeni));
    }
}
