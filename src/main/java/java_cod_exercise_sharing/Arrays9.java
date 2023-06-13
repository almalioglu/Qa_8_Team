package java_cod_exercise_sharing;

import java.util.Arrays;

public class Arrays9 {
    public static void main(String[] args) {
        /*  TASK :
        Write a method which accepts  string as parameter and prints the sum of digits
        present in thr given string
        input :"ade1r4d3"
        output : 8
        trick : Use --> Character.isDigit()
                    --> Integer.valueOf()
         */
        String str = "ade1r4d3";
        String s[]=str.split("");
        System.out.println("Arrays.toString(s) = " + Arrays.toString(s));
        int toplam=0;

        for (int i = 0; i <s.length ; i++) {
            if (Character.isDigit(str.charAt(i))){
                toplam+=Integer.parseInt(s[i]);
            }
        }
        System.out.println(toplam);



    }
}
