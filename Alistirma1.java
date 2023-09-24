
package com.mycompany.alistirma1;
public class Alistirma1 {

    public static void main(String[] args) {
        System.out.println("Hello World!"); //kodu yazdıktan sonra sonunda mutlaka ; olmalı.
        System.out.println(5);  
        System.out.println(5.99f);
        System.out.println('A');
        System.out.println(true);
    //---------------------------------------------------------------------------------------------
        //int(tam sayı) - float(ondalık sayı) - char(harf) - boolean(true,false) - string(kelime,cümle)
        int myNum = 1; 
        float myFloatNum = 5.99f; //float sayı yazarken sayının sonunda mutlaka f olmalı.
        char myLetter = 'A'; //harf yazarken mutlaka '...' arasında olmalı.
        boolean myBool = true;
        String myText = "irfan";//kelime veya cümle yazarken mutlaka "..." arasında olmalı.
        System.out.println(myNum);
        System.out.println(myFloatNum);
        System.out.println(myLetter);
        System.out.println(myBool);
        System.out.println(myText);
    //----------------------------------------------------------------------------------------------    
        //byte - short - int - long - float - double
        byte myNum2 = 100; //-128 - 127
        System.out.println(myNum2);
        
        short myNum3 = 5000; //-32768 - 32767
        System.out.println(myNum3);
    
        int myNum4 = 100000; //-2147483648 - 32767
        System.out.println(myNum4);
        
        long myNum5 = 15000000000L; //-9223372036854775808 - 9223372036854775807 long yazarken sayının sonuna "L" harfi konmalıdır.
        System.out.println(myNum5);
    
        float myNum6 = 5.75f ; //ondalık sayılarda değişkenler için sayının sonu f yazılır.
        System.out.println(myNum6);
    
        double myNum7 = 99.99d ; //çift sayılarniçin sayının sonuna d yazılır.
        System.out.println(myNum7);
        
        float f1 = 35e3f ; //böyle sayılarda 10'un kuvvetini belirtmek için "e" harfi kullanılır.(örn:35e3f -> e3=10³=1000 -> 35000)
        double d1 = 12e4d ; //(120000)
        System.out.println(f1);
        System.out.println(d1);
    //--------------------------------------------------------------------------------------------------------------------------------------------
        //değişken tanımlama çeşitleri
        int a, b, c ;
        a = b = c = 50 ;
        System.out.println(a + b + c); // = 150
        
        int d = 2 ;
        int e = 3 ;
        int f = 5 ;
        System.out.println(d + e + f); // = 10
    
        int g = 5 , h = 3 , i = 2 ; // = 0
        System.out.println(g - h - i);
    //-------------------------------------------------------------------------------------------------------------------------------------------------
        // boolean kullanımı
        boolean sa = true ;
        boolean as = false ;
        System.out.println(sa);
        System.out.println(as);
    
        int j = 10 ,k = 9; 
        System.out.println(j > k); // = true (10 9'dan büyük)
        
        int l = 10 ;
        System.out.println(l == 10);// = true (l ve 10 eşit)
        System.out.println(10 == 15);// = false ( 10 ile 15 eşit değil)
      
        int myNum8 = 25;
        int myNum9 = 18;
        System.out.println(myNum8 >= myNum9);// = true (25 18'den büyüktür.Eğer myNum8 = 18 olsaydı yine cevap true olurdu.)
    //------------------------------------------------------------------------------------------------------------------------------------------------------    
        // data types genişletme   byte -> short -> char -> int -> long -> float -> double
        int myİnt = 9;
        double myDouble = myİnt; // int, double a atılır.
        System.out.println(myİnt); // = 9
        System.out.println(myDouble); // = 9.0
    //-----------------------------------------------------------------------------------------------------------------------------------------------------
        //data type daraltma   double -> float -> long -> int -> char -> short -> byte
        double myDouble2 = 9.78 ;
        int myİnt2 = (int) myDouble2 ; //daraltmak istediğin type'ın başına küçük type'ı yazmak gerekir.
        System.out.println(myDouble2); // = 9.78
        System.out.println(myİnt2); // = 9
        
        byte m = 2 ;
        short n = 100 ;
        int o = 4 ;
        long p = m + n + o;
        System.out.println(p);
    //------------------------------------------------------------------------------------------------------------------------------------------------------
        //otomatik dönüştürme
        double sayi1 = 70.25 ;
        double sayi2 = 60d ;
        double sayi3 = 80.2 ;
        
        float sayi4 = 70.25f ;
        float sayi5 = 60f ;
        float sayi6 = 80.2f;
        System.out.println("ortalama:" + (sayi1 + sayi2 + sayi3) / 3);
        System.out.println("ortalama2:" + (sayi4 + sayi5 + sayi6) / 3);
    //------------------------------------------------------------------------------------------------------------------------------------------------------
        int q = 10 ;
        int r = q * 2 ; // = 20
        int s = q * r * 2 ; // = 400
        int toplam = q + r + s ; // = 430
        toplam = toplam - 5 ; // = 425
        System.out.println("toplam =" + toplam);
    //----------------------------------------------------------------------------------------------------
        char myChar = 'A' ;
        System.out.println(myChar);
        
        char myChar2 = 65 , myChar3 = 66 , myChar4 = 67; //char'ın dec'teki sırasını gösterir.
        System.out.println(myChar2); // = A
        System.out.println(myChar3); // = B
        System.out.println(myChar4); // = C
    //-------------------------------------------------------------------------------------------------   
        //toplama
        int t = 10 ;
        int u = 20 ;
        int v = t + u ; 
        System.out.println(v); // = 30
        
        String x = "10" ;
        String y = "20" ;
        String z = x + y ; // stringte sayıları birleştirir. 
        System.out.println(z); // = 1020
        
        String A = "10" ;
        int B = 20 ;
        String C = A + B ;
        System.out.println(C); // = 1020
    //---------------------------------------------------------------------------------------------------------
        //isim birleştirme
        String firsName = "İrfan" ;
        String lastName = "Kaşgarlı" ;
        System.out.println(firsName + " " + lastName);
        
        String firstName2 = "İrfan " ; //(boşluk var)
        String lastName2 = "Kaşgarlı" ;
        System.out.println(firstName2.concat(lastName2));
    
        String firstName3 = "İrfan " ;
        String lastName3 = "Kaşgarlı" ;
        String fullName =  firstName3 + lastName3 ;
        System.out.println(fullName);
    //--------------------------------------------------------------------------------------------
        String txt = "ABCDEFGHİJKLMNOPQRSTUVWXYZ" ;
        System.out.println("The length of the txt string is:" + txt.length()); //length = uzunluk
        
        String txt2 = "Hello World" ;
        System.out.println(txt2.toUpperCase()); // = HELLO WORLD
        System.out.println(txt2.toLowerCase()); // = hello world
        
        String txt3 = "Please locate where 'locate' occurs!" ;
        System.out.println(txt3.indexOf("locate")); //yazdığı kelimenin ilk harfinin cümledeki konumunu belirtir.
    //---------------------------------------------------------------------------------------------------------------------------    
       //cümle içinde kesme,tırnak... işareti kullanma
       /* Escape character       Result           Description
                \'                 '                Single quote
                \"                 "                Double quote
                \\                 \                Backslash
                                                                  */
      
        String txt4 = "We are the so-called \"Vikings\" from the north.";
        System.out.println(txt4);
        
        String txt5 = "It\'s alright.";
        System.out.println(txt5);
        
        String txt6 = "The character \\ is called backslash.";
        System.out.println(txt6);
    //----------------------------------------------------------------------------------------------------------------------------------
     /* Code       Result
         \n         New Line (yeni satır)
         \t         tab (4 boşluk)
         \b         Backspace (geri boşluk) */
     
        String txt7 = "Hello\nWorld" ;
        System.out.println(txt7);
        
        String txt8 = "Hello\tWorld" ;
        System.out.println(txt8);
        
        String txt9 = "Hel\blo World" ;
        System.out.println(txt9);
    //----------------------------------------------------------------------------------------------------------------------------------
    /*  Operator        Name                              Description                                                                             Example
           +             Addition(toplama)                 Adds together two values. (iki değeri toplar.)                                          x + y
           -             Subtraction(çıkarma)              Subtracts one value from another. (bir değeri diğerinden çıkarır.)                      x - y
           *             Multiplication(çarpma)            Multiplies two values. (iki değeri çarpar.)                                             x * y
           /             Division(bölme)                   Divides one value by another. (bir değeri diğerine böler.)                              x / y
           %             Modulus(kalan)                    Returns the division remainder. (bölmenin kalanını verir.)                              x % y
           ++            Increment(artış)                  Increases the value of a variable by 1. (bir değişkenin değerini 1 arttırır.)           ++x
           --            Decrement(azalış)                 Decreases the value of a variable by 1. (bir değişkenin değerini 1 azaltır.)            --x
    */    
        
        System.out.println(3 + 4.2); // = 7.2
        System.out.println(3 - 5f); // = -2.0
        System.out.println(10 / 4.0); // = 2.5
        System.out.println(3 * 4.5); // = 13.5
        System.out.println(10 % 4); // = 2
        System.out.println((3f / 4) + (4 * 5)); // = 20.75
        
        
        int D = 5 ;
        ++D ;
        System.out.println(D); // = 6
        
        int E = 5 ;
        --E ;
        System.out.println(E); // = 4
    //-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    /*  Operator        Example         Same As
         =               x = 5           x = 5
         +=              x += 3          x = x + 3
         -=              x -= 3          x = x - 3
         *=              x *= 3          x = x * 3
         /=              x /= 3          x = x / 3
         %=              x %= 3          x = x % 3
    */
        
        int F = 5 ;
        System.out.println(F); // = 5
        
        int G = 5 ;
        G += 3 ;
        System.out.println(G); // = 8
        
        int H = 5 ;
        H -= 3 ;
        System.out.println(H); // = 2
        
        int İ = 5 ;
        İ *= 3 ;
        System.out.println(İ); // = 15
        
        double J = 5 ;
        J /= 3 ;
        System.out.println(J); // = 1.6...
        
        int K = 5 ;
        K %= 3 ;
        System.out.println(K); // = 2
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------    
    /*  Operator       Name                                             Example
         ==             Equal to (eşit)                                  x == y
         !=             Not equal (eşit değil)                           x != y
         >              Greater than (büyüktür)                          x > y
         <              Less than (küçüktür)                             x < y
         >=             Greater than or equal to (büyük eşittir)         x >= y
         <=             less than or equal to (küçük eşittir)            x <= y
    */    
        int L = 5 ;
        int M = 3 ;
        System.out.println(L == M); // = false
        
        int N = 5 ;
        int O = 3 ;
        System.out.println(N != O); // = true
                
        int P = 5 ;
        int Q = 3 ;
        System.out.println(P > Q); // = true
        
        int R = 5 ;
        int S = 3 ;
        System.out.println(R < S); // = false
        
        int T = 5 ;
        int U = 3 ;
        System.out.println(T >= U); // = true
        
        int V = 5 ;
        int W = 3 ;
        System.out.println(V <= W); // = false
    //--------------------------------------------------------------------------------------------------------------------    
    /*  Operator     Name                 Description                                                                                                   Example                                                                                
         &&           Logical and          Returns true if both statements are true (her iki ifade doğruysa doğru)                                       x < 5 && x < 10
         ||           Logical or           Returns true if one of the statements is true (ifadelerden biri doğruysa doğru)                               x < 5 || x < 4
         !            logaical not         Reverse the result, returns false if the result is true (sonucu tersine çevirir, sonuç doğruysa yanlış)       !(x < 5 && x < 10)
    */    
        int X = 5 ;
        System.out.println(X > 4 && X < 10); // = true && true = true
    
        int Y = 5 ;
        System.out.println(Y > 3 || Y < 4); // = true || false = true
    
        int Z = 5 ;
        System.out.println(!(Z > 3 && Z < 10)); // parantez içi = true fakat ! işareti olduğu için = false
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  
        





}}

