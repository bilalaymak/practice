package practice1;

import java.util.Locale;
import java.util.Scanner;

public class practice2inputalma {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);
        System.out.println("bir sayı giriniz");

        int a = scan.nextInt();
        System.out.println("a değişkeninin değeri" + a);

        double d = scan.nextDouble();
        System.out.println("d degiskeninin degeri" + d);




    }







}
