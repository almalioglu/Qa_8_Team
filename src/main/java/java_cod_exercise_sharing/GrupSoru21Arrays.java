package java_cod_exercise_sharing;

import java.util.ArrayList;

public class GrupSoru21Arrays {
    public static void main(String[] args) {

       /* İsmi changeInArraylist() olan bir method oluşturun.
        Parametre olarak String ArrayList, String s1, String s2
        Arraylist'te s1'i s2 olarak değiştirin */

        ArrayList<String> samanyolu = new ArrayList<>();//ArrayList Kalibi

        samanyolu.add("gunes");
        samanyolu.add("dunya");
        samanyolu.add("ay");
        samanyolu.add("mars");
        samanyolu.add("venus");
        samanyolu.add("venus");
        samanyolu.add("venus");

        String s1 = "venus";
        String s2 = "gunes";
        
        System.out.println("Önce: " + samanyolu); //[gunes, dunya, ay, mars, venus, venus]


        changeInArrayList(samanyolu, s1, s2);
        System.out.println("Sonra: " + samanyolu); //[gunes, dunya, ay, mars, gunes, gunes]
    }

    public static void changeInArrayList(ArrayList<String> samanyolu, String s1, String s2) {

        for (int i = 0; i < samanyolu.size(); i++) {
            if (samanyolu.get(i).equals(s1)) {
                samanyolu.set(i, s2);
            }


























        }

    }
}
