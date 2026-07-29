public class Demo {
    public static void main(String[] args) {
        // // Integers --> byte, short, int, long
        // // binary(2), octal(8), decimal(10), hexadecimal(16)
        
        // byte b = 5;
        // // byte b = 0b101; // binary representation of 5
        // // byte b = 05; //octal representation of 5
        // // byte b = 0x5; // hexadecimal representation of 5 also written as 0XA
        // short s = 10;
        // int i = 4000;
        // long l = 100000;
        // // Real 
        // float f = 10.53f; // 32 bits single precision
        // double d = 23.0987; //64 bits double precision
        // // double d = 6.022e23; // 6.022 * 10^23 --> scientific notation

        // // Characters
        // char c = 'a'; //'a' --> int value of a = 97 --> binary value of 97 = 01100001 --> store 01100001 in memory

        // // Boolean
        // boolean bool = true;
    

        // System.out.println("Integer Data Types: " + b + ", " + s + ", " + i + ", " + l);
        // System.out.println("Real numberTypes: " + f + ", " + d );
        // System.out.println("Character: " + c);
        // System.out.println("Boolean: " + bool);

        // float f = 8.1434f;
        // float f1 = 0.7f;
        // System.out.printf("%.20f%n",f); // 8.14340019226074218750
        // System.out.printf("%.20f%n", f1); //float f = 8.1434f

        // --------------TYPE CONVERSION ---------------
        // IMPLICIT TYPE CONVERSION/ CASTING
        // (byte to int)
        // byte b = 24;
        // int i;
        // i = b;
        // System.out.println(i); //24

        // char to int
        // char c = 'a';
        // int i;
        // i = c;
        // System.out.println(i); //97

        // EXPLICIT TYPE CONVERSION/ CASTING
        // int i = 24;
        // byte b; //-128 to 127
        // b = (byte) i;
        // System.out.println(b); // 44 --> 300 % 256 = 44

        // TRUNCATING CONVERSION
        // float f = 15.678f;
        // int i;
        // i = (int) f;
        // System.out.println(i); //15

        // BOOLEAN TO ANY DATATYPE CONVERSIONS ARE NOT POSSIBLE

        // TYPE PROMOTION
        // byte b = 50;
        // b = b * 2  //This is converted to int for ease
        // RULES
        // 1. byte,short and char are promoted to int
        // 2. If one operand is long, the whole expression becomes long
        // 3. If one operand is float, entire expression will become float
        // 4. If one operand is double, entire expression will become double
        // byte b = 50;
        // b = (byte) (b * 2);
        // System.out.println(b); //100

        //-----------OPERATORS in JAVA--------
        // ARITHMETIC OPERATORS --> +, -, *, /, %, +=, -=, *=, /=, %=, ++, --
        // int a = 5;
        // int b = 10;
        // int c = a + b; // 15
        // int d = a - b; // -5
        // int e = a * b; // 50
        // int f = b / a; // 2
        // int g = b % a; // 0
        // System.out.println(c + " , " + d + " , " + e + " , " + f + " , " + g);

        // int h = a + 2;
        // //h = h + 2; // Since this is okay in CSE
        // h += 2; // h = h + 2; // h = 9
        // h -= 2; // h = h - 2; // 7
        // h *= 3; // h = h * 3;
        // h /= 5; // h = h / 5;
        // h %= 5; // h = h % 5;
        // System.out.println(h); 
        
        // int i = 6;
        // i++; // i = i + 1 --> i += 1; 
        // i--; // i = i - 1 --> i -= 1;
        // System.out.println(i); // i = 7;

        // // pre increment and post increment/decrement.
        // int j = 7;
        // j++;  //postfix increment
        // ++j; // prefix increment
    
        // // j = 9
        // int k = j++; // k = j; j = j + 1;
        // System.out.println(j + " , " + k); // 10, 9
        // int l = ++j; // l = j + 1;
        // System.out.println(j + " , " + l); // 11, 11

        // RELATIONAL OPERATORS -> ==, !=, <, > , <=, >=
        // int a = 10;
        // int b = 10;
        // boolean c = (a == b);
        // System.out.println(c); // true
        // boolean d = (a != b);
        // System.out.println(d); // false

        // boolean e = (a < b); // false
        // boolean f = (a <= b); // true
        // System.out.println(e);
        // System.out.println(f);

        // BITWISE OPERATORS --> &, |, ^, ~, <<, >>, >>>
    //    int a = 2; // 10 --> 00000000 00000000 00000000 00000010
    //    int b = 3; // 11 --> 00000000 00000000 00000000 00000011
    //    int c = a & b; // 10 --> 2
    //    int d = a | b; // 11 --> 3
    //    int e = a ^ b; // 01 --> 1
    //    int f = ~a; // 11111111 11111111 11111111 11111101 --> -3
    //    System.out.println(c + " , " + d + " , " + e + " , " + f);

    //    // Shift operations
    //    int g = 1; //   00000000 00000000 00000000 00000001 --> 1
    //    g = g << 33; // g = g << 33 == g << 1 
    
    //    // Right shift (>>) (>>>) 
    //    byte h = 1; // 00000001
    //    h = (byte)(h << 1); // 00000010 --> 2
    //    System.out.println(g);
    //    System.out.println(h);

    // LOGICAL OPERATORS --> &&, ||
    //    int a = 25;
    //    int b = 10;
    //    int c = 15;
    //    boolean d = (a < b) && (b < c);
    //    // Short circuit
    //    System.out.println(d); // false


        // BITWISE OPERATORS.
        // int a = 2; // 00000000 00000000 00000000 00000010
        // int b = 3; // 11
                  
        // int c = a & b; // 10 --> 2
        // int d = a | b; // 11 --> 3
        // int e = a ^ b; // 01 --> 1
        // int f = ~a; //  11111111 11111111 11111111 11111101 == -3
        // System.out.println(c + " , " + d + " , " + e + " , " + f);

        // byte g = 1;
        // //int h = (g << 8);  // 00000001 --> 1 00000000 --> 0

        // int h = 1;
        // h = h << 33;
        // System.out.println(h); // 2

        // byte i = 127; // 01000000 --> 00000000
        // byte j = (byte) (i >> 8);
        // // >>>
        // //System.out.println(j); // 1

        // -------------------LOOPS--------------------------------
        boolean c = true;
        int i = 6;
        // SELECTION STATEMENTS --> if, if-else, if-else-if, switch
        // Normal if statement
        // if(i > 5 && i < 10){
        //     System.out.println("i is greater than 5");
        // }
        // else{
        //      System.out.println("i is less than or equal to 5");
        // }
    //     if(i % 2 == 0){
    //         System.out.println(" i is even no");
    //     }
    //     else{
    //         System.out.println("i is an odd no");
    //     }
    // }
}