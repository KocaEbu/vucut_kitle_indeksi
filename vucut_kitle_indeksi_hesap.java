import java.util.Scanner;

public class vucut_kitle_indeksi_hesap {
    public static void main(String[] args) {

        double boy,kilo;
        double indeks;

        Scanner input= new Scanner(System.in);

        System.out.print("Lutfen boyunuzu metre cinsinden giriniz : ");
        boy=input.nextDouble();

        System.out.print("Lutfen kilonuzu kg cinsinden girin : ");
        kilo=input.nextDouble();

        indeks = kilo/(boy*boy);

        System.out.println("Boy: "+boy);
        System.out.println("Kilo: "+kilo);
        System.out.println("Indeks: "+indeks);


    }
}
