package JavayaGiris1;

import java.util.Scanner;
public class JavayaGirisUygulama1 {
    public static void main(String[] args) {
        //if komutları ve fonksiyonlar kullanılmadan giriş niteliğinde not ortalaması projesi yapılmıştır.

        Scanner input=new Scanner(System.in);

        int vize,proje,finalNot;
        String gecmeDurumu;

        System.out.print("Vize notunuzu giriniz: ");
        vize=input.nextInt();
        System.out.print("Final notunuzu giriniz: ");
        finalNot=input.nextInt();
        System.out.print("Proje notunuzu giriniz: ");
        proje=input.nextInt();

        double ortalama=(vize+finalNot+proje)/3.0;
        gecmeDurumu=(ortalama>50)? "Geçti" : "Kaldı";

        System.out.println("Ortalamanız: "+ortalama);
        System.out.println("Geçme durumu: "+gecmeDurumu);

    }
}
