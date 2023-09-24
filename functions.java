import java.util.Scanner;

public class test {
    // ----------------------------------------------------------------
    public static void selamlama() {
        System.out.println("selamlar");
    }

    // -----------------------------------------------------------------
    public static void faktoriyel() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("bir sayı girin : ");
        int sayi = scanner.nextInt();
        int faktoriyel = 1;
        while (sayi > 0) {
            faktoriyel *= sayi;
            sayi--;
        }
        System.out.println("faktoriyel : " + faktoriyel);
    }

    // -----------------------------------------------------------------
    public static void toplama(int x, int y, int z) {
        System.out.println("toplamları : " + (x + y + z));
    }

    // -----------------------------------------------------------------
    public static void selamlama(String isim) {
        System.out.println("selamlar " + isim);
    }

    // -----------------------------------------------------------------
    static void myMethod(String name, int age) {
        System.out.println(name + " is " + age);
    }// -----------------------------------------------------------------

    static void checkAge(int age) {
        if (age < 18) {
            System.out.println("giremez");
        } else {
            System.out.println("girebilir");
        }
    }

    // -----------------------------------------------------------------
    public static int ikiilecarp(int a) {
        return a * 2;
    }

    public static int ikiiletopla(int a) {
        return a + 2;
    }

    public static int dortilecarp(int a) {
        return a * 4;
    }

    // -----------------------------------------------------------------
    static int myMethod(int x, int y) {
        return x + y;
    }

    // -----------------------------------------------------------------
    public static void skorhesapla(String isim, int puan) {
        System.out.println(isim + " adlı oyuncunun " + puan + " puanı var.");
    }

    public static void skorhesapla(int puan) {
        System.out.println("isimsiz oyuncunun " + puan + " puanı var");
    }

    public static void skorhesapla(String isim) {
        System.out.println(isim + " adlı oyuncunun hiç puanı yok");
    }

    // -----------------------------------------------------------------
    public static void toplama(String a, String b) {
        System.out.println(a + " " + b);
    }

    public static void toplama(int a, int b) {
        System.out.println("toplamları : " + (a + b));
    }
    //-----------------------------------------------------------------
    static int plusMethod(int x, int y) {
        return x + y;
      }
      static double plusMethod(double x, double y) {
        return x + y;
      }
    public static void main(String[] args) {
        int myNum1 = plusMethod(8, 5);
        double myNum2 = plusMethod(4.3, 6.26);
        System.out.println("int : " + myNum1);
        System.out.println("double : " + myNum2);

    }

}
