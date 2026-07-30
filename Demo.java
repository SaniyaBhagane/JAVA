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
        // boolean c = true;
        // int i = 6;
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

    // Nested if 
    // If can have an else statement or not 
    //  if(i > 5){
    //     if(i < 10){
    //         if(i == 7){
    //             System.out.println("i is equal to 7");
    //         }
    //     }
    //     else{
    //         System.out.println("i is greater than or equal to 10");
    //     }
    //     }
    //     else{
    //         System.out.println("i is less than or equal to 5");
    //     }
    // // Above can be simplified by using logical operator
    // if(i > 5 && i < 10){
    //     System.out.println("i is greater than 5 and less than 10");
    // }
    // else{
    //     System.out.println("i is less than or equal to 5 or greater than or equal to 10");
    // }

    // If-else-if ladder
    // if(i < 5){
    //         System.out.println("i is less than 5");
    //     }
    //     else if(i < 10){
    //         System.out.println("i is less than 10");
    //     }
    //     else if(i < 15){
    //         System.out.println("i is less than 15");
    //     }
    //     else{
    //         System.out.println("i is greater than or equal to 15");
    //     }

    // int age = 50; // age = 50
    //     if(age > 80) {
    //         System.out.println("You are very old");
    //     }
    //     if(age > 60) {
    //         System.out.println("You are old");
    //     }
    //     if(age > 40) {
    //         System.out.println("You are becoming old");
    //     }
    //     if(age > 20) {
    //         System.out.println("You are young");
    //     }
    //     else {
    //         System.out.println("You are a child");
    //     }

    // Switch statement
    // int day = 3;
    //     switch(day){
    //         case 1:
    //             System.out.println("Monday");
    //             break;
    //         case 2:
    //             System.out.println("Tuesday");
    //             break;
    //         case 3:
    //             System.out.println("Wednesday");
    //             break;
    //         case 4:
    //             System.out.println("Thursday");
    //             break;
    //         case 5:
    //             System.out.println("Friday");
    //             break;
    //         case 6:
    //             System.out.println("Saturday");
    //             break;
    //         case 7:
    //             System.out.println("Sunday");
    //             break;
    //         default:
    //             System.out.println("Invalid day");
    //     }
        // switch --> limited use case -> should evaluate to byte, short, int, char, Enumeration.
        // No duplicate cases allowed.
        // After JDK7 Strings can also be used as switch expression. 
        // After JDK-14 switch is enhanced too much.

        // Nested Switch
        // int j = 5;
        // int k = 1;
        // switch(j){
        //     case 1:
        //         System.out.println("j is 1");
        //         break;
        //     case 2:
        //         System.out.println("j is 2");
        //         break;
        //     case 3:
        //         System.out.println("j is 3");
        //         break;
        //     case 4:
        //         System.out.println("j is 4");
        //         break;
        //     case 5:
        //         System.out.println("j is 5");
        //         switch(k){
        //             case 1:
        //                 System.out.println("k is 1");
        //                 break;
        //             case 2:
        //                 System.out.println("k is 2");
        //                 break;
        //             default:
        //                 System.out.println("k is not 1 or 2");
        //         }
        //         break;
        //     default:
        //         System.out.println("j is not between 1 and 5");
        // }

        // Switch expressions should be evaluated to byte, short, int, char, Enumerate
        // After JDK-7 Strings can also be used as switch expression.


//---------------LOOPS-------------------------

        //int i = 1; // 1 to 10
        // System.out.println(i);
        // i++;
        // System.out.println(i);
        // i++;
        // System.out.println(i);
        // i++;

        // Loops --> while --> infinite
        /*
            while(expression) {
                // do something

            }
        */

        // while(i < 10) { // boolean --> true / false
        //     System.out.println(i); 
        //     i++;
        // }


        // do {
        //     // do something
        // } while(expression);

        // do {
        //     System.out.println(i);
        //     i++;
        // } while(i <= 10);

        // Menu item selection --> do-while
        /*
            1. Play Game
            2. Return saved Game
            3. Exit
        */
        // 1 to 10
        
        // for(int i = 10; i >= 1; i--) { // boolean --> true / false
        //     System.out.println(i);
        // }
        
        /*
         FLow of control of for
         1. First assignment statement is executed (Variable definition).
         2. Then second conditional statement is evaluated. (True / false)
         3. If true, control flow will evaluate the body of the loop.
         4. Once loop body is finished, control flow will go back to the for statement, and ithird increment
         statement will be evaluated.
         5. Again, conditional statement is evaluated.
         6. Repeat 2 - 5.
        */

         //int i = 1;
        // Comma seprated variation
        // for(int i = 1, j = 1; i <= 10 && j <= 5; i++, j+=2) {
        //     System.out.println(i * j);
        // }

        //boolean b = true;
        // for(int i=1; b == true; i++) {
        //     if(condition) {
        //         b = false;
        //     }
        // }

        // Integers -> byte, short, int, long

        // for(int i = 1; i <= 10; i++) {
        //     System.out.println(i);
        // }

        // Nested Loops
        // for(int i = 1; i<= 10; i++) {
        //    for(int j = 1; j <= i; j++) {
        //         System.out.print("* ");
        //    }
        //    System.out.println();
        // }

        /*
         i = 2
         * 
         * *
         * * * 
         * * * *
         * * * * *
         
        */

         // Jump Statements in Java
         // break, continue

        // boolean b = false;
        // for(int i = 1; i <= 10; i++) {
        //     System.out.println(i);
        //     if(b == true) {
        //         break;
        //     }
        // }

        // Whether a number is prime or not
        // int p = 9;
        // // 2, 3, 4, 5, .... 6, 7
        // int i;
        // for(i = 2; i < p; i++) {
        //     if(p % i == 0) {
        //         System.out.println("The number is not prime");
        //         break;
        //     }
        // }
        
        // if(i == p) {
        //     System.out.println("The number is prime");
        // }
        // for(int i=1; i<=10; i++) {
        //     if(i % 2 == 0) {
        //         continue;
        //     }
        //     System.out.println(i);
        // }

        // Break in nested loops
        // for(int i = 1; i<= 10; i++) {
        //    for(int j = 1; j <= i; j++) {
        //         System.out.print("* ");
        //         if(j >= 5) {
        //             break;
        //         }
        //    }
        //    System.out.println();
        // }

        // Labels
        // outer: for(int i = 1; i<= 10; i++) {
        //    inner: for(int j = 1; j <= i; j++) {
        //         System.out.print("* ");

        //         if(j >= 5) {
        //             break outer;
        //         }
        //    }
        //    System.out.println();
        // }
        /*
        *
        * *
        * * *
        * * * *
        * * * * *
        */

        // Code blocks
        // first: {
        //     second: {
        //         third: {
        //             System.out.println("Hello");
        //             break first;
        //         }
        //     }
        // }

        // -------------------------------ARRAYS--------------------------------

        //int[] rollNums = new int[3];
        int rollNums[] = new int[3];
        // 101, 102, 103
        // rollNums[0] = 101;
        // rollNums[1] = 102;
        // rollNums[2] = 103;
        // System.out.println(rollNums[0]);
        // System.out.println(rollNums[1]);
        // System.out.println(rollNums[2]);
        // System.out.println(rollNums.length);
        int x = 101;
        for(int i=0; i < rollNums.length; i++) {
            rollNums[i] = x;
            x++;
        }
        for(int i=0; i < rollNums.length; i++) {
            System.out.println(rollNums[i]);
        }
    }
}