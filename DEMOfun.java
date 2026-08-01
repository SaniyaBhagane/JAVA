public class DEMOfun {
    // public static void main(String[] args) { 
    //     // Funtions in Java
    //     greet();

    //     sayHello("Rohit");  // Arguments

    //     System.out.println(getNumber());

    //     System.out.println(multiply(2, 4)); // 8

    //     return; // optional
    // }

    // // NO Ip, No op
    // static void greet() {
    //     System.out.println("Hello");
    //     return;
    // }

    // // IP. No OP
    // static void sayHello(String name) { // Number of parmeters can be anything
    //     System.out.println("Hello " + name);
    // }

    // // No ip, OP
    // static int getNumber() {
    //     return 10;
    // }

    // // IP, OP
    // static int multiply(int a, int b) {
    //     return (a * b);
    // }


    // public static void main(String[] args) {
    //     // Function overloading
    //     int x = sum(2, 3);
    //     System.out.println(x);

    //     int y = sum(5, 6);
    //     System.out.println(y);

    //     int z = sum(3,5,6); // 14
    //     System.out.println(z);

    //     greet("Aditya", 28);
    //     greet(28, "Rohit");

    //     fun();

    // }

    // static int sum(int a, int b) {
    //     return (a + b);
    // }

    // static int sum(int a, int b, int c) { // different no. of parameters
    //     return (a + b + c);
    // }

    // static int sum(double a, double b) { // different types of parameters
    //     return (int)(a + b);
    // }

    // static void greet(String name, int age) {
    //     System.out.println("Hi " + name + ". Your age is " + age);
    // }

    // static void greet(int age, String name) { // ordering of parameters
    //     System.out.println("Hi " + name + ". Your age is " + age);
    // }

    // static void fun() {
    //     System.out.println("Hello");
    // }

    // static int fun2() {
    //     System.out.println("Hello");
    //     return 5;
    // }


    public static void main(String[] args) {
        // Chaining of functions
        fun1();
        System.out.println("bye");
    }

    static void fun1() {
        fun2();
        System.out.println("Hi");
    }

    static void fun2() {
        fun3();
        System.out.println("Hello");
    }

    static void fun3() {
        System.out.println("How are you");
    }
}
