package java_sorubankasi;

public class Try {

    //7.Soru

 static int a = 11;
public static void main(String[] args) {
 int b = 12;
 System.out.println(b);
}
static{
 int c = 13;
 System.out.println(c);
}
static{
 a = 14;
 System.out.println(a);
}




    //Bazen main method calistirilmadan once variable larin hazir hale getirilmesi gerekir
    //Bu yuzden static block lar kullanilir
    //static variable lar static blocklar icinde initialize edilirse o class in icinde
    //her seyden once hazir hale getirilmis olur
    //birden fazla static block olmasi durumunda yukarda olan once calisir
    //main method olmadan static block lar calismaz

}
