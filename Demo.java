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
        // Arithmatic Operators --> +, -, *, /, %, +=, -=, *=, /=, %=, ++, --
        int a = 5;
        int b = 10;
        int c = a + b; // 15
        int d = a - b; // -5
        int e = a * b; // 50
        int f = b / a; // 2
        int g = b % a; // 0
        System.out.println(c + " , " + d + " , " + e + " , " + f + " , " + g);

        int h = a + 2;
        //h = h + 2; // Since this is okay in CSE
        h += 2; // h = h + 2; // h = 9
        h -= 2; // h = h - 2; // 7
        h *= 3; // h = h * 3;
        h /= 5; // h = h / 5;
        h %= 5; // h = h % 5;
        System.out.println(h); 
        
        int i = 6;
        i++; // i = i + 1 --> i += 1; 
        i--; // i = i - 1 --> i -= 1;
        System.out.println(i); // i = 7;

        // pre increment and post increment/decrement.
        int j = 7;
        j++;  //postfix increment
        ++j; // prefix increment
    
        // j = 9
        int k = j++; // k = j; j = j + 1;
        System.out.println(j + " , " + k); // 10, 9
        int l = ++j; // l = j + 1;
        System.out.println(j + " , " + l); // 11, 11

    }
}