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
        
    }
}