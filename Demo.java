public class Demo {
    public static void main(String[] args) {
        // Integers --> byte, short, int, long
        // binary(2), octal(8), decimal(10), hexadecimal(16)
        // byte b = 5;
        byte b = 0b101; // binary representation of 5
        short s = 10;
        int i = 4000;
        long l = 100000;

        // Real 
        float f = 10.53f;
        double d = 23.0987;

        // Characters
        char c = 'a'; //'a' --> int value of a = 97 --> binary value of 97 = 01100001 --> store 01100001 in memory

        // Boolean
        boolean bool = true;
    

        System.out.println("Integer Data Types: " + b + ", " + s + ", " + i + ", " + l);
        System.out.println("Real numberTypes: " + f + ", " + d );
        System.out.println("Character: " + c);
        System.out.println("Boolean: " + bool);
    }
}