import java.util.Scanner;

public class Main {

    static int asalSayi(int number, int i) {
        if (i == 1)
            return 1;
        else if (number % i == 0)
            return 0;
        else
            return asalSayi(number, i - 1);
    }

    public static void main(String[] args) {
        int value, sonuc;
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        value = scan.nextInt();

        sonuc = asalSayi(value, value / 2);

        if (sonuc == 1)
            System.out.print(value + " sayısı asaldır.");
        else
            System.out.print(value + " sayısı asal değildir.");
    }
}