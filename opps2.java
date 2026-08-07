
//------ ENCAPSULATION -------------
// public class opps2 {
//     public static void main(String[] args) {
//         BankAccount ba = new BankAccount();
//         ba.deposit(500);
//         ba.withdraw(300);

//         System.out.println(ba.getBalance());
//     }
// }

// class BankAccount {
//     private double balance;

//     public void deposit(int amount) {
//         balance += amount;
//     }

//     public void withdraw(int amount) {
//         // amount <= balance
//         balance -= amount;
//     }

//     // getters / Setters
//     public double getBalance() {
//         return balance;
//     }
// }

// class Student {
//     private String name;
//     private int rollNumber;
//     private int age;
//     private String college;

//     Student(String name, int rollNumber, int age, String college) {
//         this.name = name;
//         this.age = age;
//         this.rollNumber = rollNumber;
//         this.college = college;
//     }

//     //getters and setters
//     public String getName() {
//         return name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public String getCollege() {
//         return college;
//     }

//     public void setCollege(String college) {
//         // Validations --> college should be real.
//         this.college = college;
//     }

// }

// ----------------------INHERITANCE----------------------------------

// public class opps2 {
//     public static void main(String[] args) {
//         EngineeringStudent es = new EngineeringStudent();
//         es.markAttendance();
//         es.attendLab();

//         Student s1 = new Student();
//         s1.markAttendance();
//        // s1.attendLab(); (wrong)
//     }
// }
/*
parent (Superclass) --> child (subclass)
*/
// class Student {
//     String name;
//     int age;
//     public void markAttendance() {
//         System.out.println("Attendance marked");
//     }
// }
// class EngineeringStudent extends Student {
//     void attendLab() {
//         System.out.println("lab attended");
//     }
// }

//Types of inheritance
// Simple inheritance
// multi-level inheritance 
// hierarchical inheritance
// multiple inheritance (not supported in java)

// public class opps2 {
//     public static void main(String[] args) {
//         //CSEEngineeringStudent cs1 = new CSEEngineeringStudent();
//     }
// }

// class Student { // Parent -> A
//     String name;
//     int age;

//     public void markAttendance() {
//         System.out.println("Attendance marked");
//     }
// }

// class EngineeringStudent extends Student { // Child. --> B
//     void attendLab() {
//         System.out.println("lab attended for engineerng student");
//     }
// }

// class MedicalStudent extends Student { // Child. --> C
//     void attendLab() {
//         System.out.println("lab attended for medical student");
//     }
// }

// class CSEEngineeringStudent extends EngineeringStudent {
//     void attendCSELab() {

//     }
// }

/*
Multi-level

Student 
|
EngineeringStudent
|
CSEEngineeringStudent
*/

/*
Hierrarchy 
        A
      /   \
     B     C 

*/

/*
Multiple 
        A   B
         \  /
          C
*/     

//--------------------------ABSTRACTION------------
// public class oops2{
//         public static void main(String[] args){
//                 Car fcar = new FuelCar();
//                 Car ecar = new ElectricCar();
//                 fcar.start();
//                 fcar.accelerate();
//                 fcar.brake();
//                 ecar.accelerate();
//                 ecar.brake();
//         }
// }

// abstract class Car{
//         void start(){
//                 System.out.println("Car started.");
//         }
//         abstract void accelerate();
//         abstract void brake();
// }
// class FuelCar extends Car{
//         @Override
//         void accelerate(){
//                 System.out.println("Fuel car accelerated.");
//         }
//         void brake(){
//                 System.out.println("Fuel car stopped.");
//         }
// }
// class ElectricCar extends Car{
//         @Override
//         void accelerate(){
//                 System.out.println("Electric car accelerated.");
//         }
//         void brake(){
//                 System.out.println("Electric car stopped.");
//         }
// }

//INTERFACE
// public class opps2{
//         public static void main(String[] args) {
//                 Car fcar = new FuelCar();
//                 Car ecar = new ElectricCar();
//                 fcar.start();
//                 fcar.accelerate();
//                 fcar.brake();
//                 ecar.start();
//                 ecar.accelerate();
//                 ecar.brake();
//         }
// }
// interface Car{
//     void start();
//     void accelerate();
//     void brake();    
// }
// class FuelCar implements Car{
//     @Override
//     public void start(){
//         System.out.println("Fuel car started.");
//     }
//     @Override
//     public void accelerate(){
//         System.out.println("Fuel car accelerated.");
//     }
//     @Override
//     public void brake(){
//         System.out.println("Fuel car stopped.");
//     }
// }
// class ElectricCar implements Car{
//     @Override
//     public void start(){
//         System.out.println("Electric car started.");
//     }
//     @Override
//     public void accelerate(){
//         System.out.println("Electric car accelerated.");
//     }
//     @Override
//     public void brake(){
//         System.out.println("Electric car stopped.");
//     }
// }

// ----------------POLYMORPHISM-------------------
// public class opps2{
//          public static void main(String[] args) {
//         A a = new B();
//         //a.fun();
//         //System.out.println(a.x);
//         System.out.println(a.getX());
//     }
// }
//Static --> they belong to class and not to objects
// private methods cant be overriden 
// final methods cannot be overriden

// Final --> class ??? --> you cannot create child of that class

// Fields / Varables they cannot be polymorphic

// class A {
//     static void fun() {
//         System.out.println("Hello");
//     }
//     private void fun2() {
//         System.out.println("Hello");
//     }
//     final void fun3() {
//         System.out.println("Hello");
//     }
// }
// class B extends A {
//     static void fun() {
//         System.out.println("Bye");
//     }
//     // void fun3() {
//     //     System.out.println("Bye");
//     // }
// }
// class A {
//     //int x = 10;
//     int getX() {
//         return 10;
//     }
// }
// class B extends A {
//     int getX() {
//         return 20;
//     }
// }

// public class opps2 {
//     public static void main(String[] args) {
//     }
// }
// class Sample {}
// class Sample2 {}
// 1. Why one public class per file.
//2 WHy name of that public class should be same as filename

// JVM --> Demo.java. --> Demo.main()

//BOXING AND UNBOXING
// public class opps2 {
//     public static void main(String[] args) {
        // Autoboxing
        // int x = 10;
        // Integer y = x;  // autoboxing
        // System.out.println(x);
        // System.out.println(y);  // unboxing

        // //Unboxing
        // Integer a = 20; // Autoboxing
        // int b = a; // unboxing
        // System.out.println(a); // unboxing
        // System.out.println(b);  
        // int x = 50;
        // printInteger(x);
        // Integer a = 10;
        // Integer b = 20;
        // int sum = a.intValue() + b.intValue();
        // System.out.println(sum);
    //     Integer x = null;
    //     int y = x;
    //     System.out.println(y);
    // }
    // static void printInteger(Integer x) {
    //     System.out.println(x);
    // }
// }
// 1. Assignments
// 2. Method calls
// 3. Arithmetic operations

// public class opps2 {
//     public static void main(String[] args) {
//         // int x = 100;
//         // int y = 100;
//         // System.out.println(x == y);
//         Integer a = 200;
//         Integer b = 200;
//         // a == b --> If a and b points to same reference
//         System.out.println(a.equals(b));
//     }
// }

// public class opps2 {
//     public static void main(String[] args) {
//         Animal a = new Dog("Bruno");
//         a.makeSound();
//     }
// }
// abstract class Animal {
//     String name;
//     Animal(String name) {
//         this.name = name;
//     }
//     void makeSound() {
//         System.out.println("making sound");
//     }
//     final void sleep() {
//         System.out.println("Sleeping");
//     }
// }
// class Dog extends Animal {
//     Dog(String name) {
//         super(name);
//     }
//     @Override
//     void makeSound() {
//         System.out.println("Making barking sound");
//     }
// }

// Abstract classes
//1. Cannot be instantiated directly
//2. Can contain abstract method (method without implementations)
//3. Can also contain normal methods.
//4. Is meant to be extended.

//. Questions:
//1. Can abstract classes have constructors?  --> Yes
//2. Can abstract classes be final ? --> No
//3. Can abstract class have static methods/variables ? --> Yes
//4. Can abstract classes private methods ? --> yes but non abstract
//5. Can abstract classes have final methods ? --> yes but non abstract
//6. Can abstract classes have no abstract method ? --> Yes

//NESTED CLASSES

// Static nested class
// public class opps2{
//     public static void main(String[] args) {
//         Outer outer = new Outer();
//         Outer.Inner inner = new Outer.Inner(outer);
//         inner.fun();
//     }
// }
// class Outer {
//     private static int x = 4;
//     int y;
//     static class Inner {
//         Outer outer;
//         private String name;
//         private static int number;
//         Inner(Outer outer) {
//             this.outer = outer;
//         }
//         void fun() {
//             System.out.println(x);
//             System.out.println(outer.y);
//         }
//         static void fun2() {
//         }
//     }
// }
// class BankAccount {
//     private static class InterestCalculator {
//         static double calculateYearly(double principal, double rate) {
//             return principal * rate;
//         }
//     }
//     public double computeIntersest(double principal) {
//         return InterestCalculator.calculateYearly(principal, 0.09);
//     } 
// }
// Use cases of static nested classes :
/*
 1. As helper class for any outer class.
 2. Builder Design pattern
 3. If you want to have static methods inside a nested class.
 4. Request/Response DTO
*/

//INNER CLASS
// public class opps2{
//     public static void main(String[] args) {
//         Outer outer = new Outer();
//         //Outer.Inner inner = new Outer.Inner(); invalid
//         Outer.Inner inner =  outer.new Inner();
//        // Outer.Inner inner = new Outer().new Inner();
//         inner.fun();
//         inner.fun2();
//         Outer.Inner.fun2();
//     }
// }
// class Outer {
//     int x = 10;
//     class Inner {
//         //int x = 20;
//         //Outer outer;
//         static int x = 10;
//         void fun() {
//             System.out.println(x);
//             //System.out.println(Outer.this.x);
//         }
//         static void fun2() {
//             System.out.println("Hello");
//         }
//     }
// }
// Use cases of inner classes
/*
    1. As helper class for any outer class.
    2. If you want to have non static methods inside a nested class.
    3. If you want to access outer class members from inner class.
    4. Event listeners in GUI programming.
    5. Threading
    6. Callback functions
    7. Adapter design pattern
    8. Iterator design pattern
    9. Observer design pattern
    10. Decorator design pattern
    11. Strategy design pattern
    12. State design pattern
    13. Command design pattern
    14. Visitor design pattern
    15. Mediator design pattern
    16. Memento design pattern
    17. Prototype design pattern
    18. Singleton design pattern
    19. Factory design pattern
    20. Abstract factory design pattern
*/

//LOCAL CLASS
// public class opps2{
//      public static void main(String[] args) {
//         Outer outer = new Outer();
//         outer.greet();
//     }
// }
// // Effective final variable
// class Outer {
//     void greet() {
//         int y = 5;
//         y++;
//         class Local {
//             void sayHello() {
//                 System.out.println(y);
//             }
//         }
//         Local local  = new Local();
//         local.sayHello();
//     }
// }
/*
Contructor
Method
If
Loop
Static block
*/

// ANONYMOUS CLASSS
// public class opps2{
//     public static void main(String[] args) {
//         // Person p1 = new Person();
//         // p1.introduce();
//         // Person p2 = new Guest();
//         // p2.introduce();
//         Person p2 = new Person() {
//             String name = "Aditya";
//             @Override
//             void introduce() {
//                 greet();
//                 System.out.println("Hi, I am " + name);
//             }
//             void greet() {
//                   System.out.println("Hello");
//             }
//         };
//         p2.introduce();
//     }
// }
// class Person {
//     Person() {
//     }
//     void introduce() {
//         System.out.println("Hi, I am a person");
//     }
// }
// class Guest extends Person {
//     @Override
//     void introduce() {
//         System.out.println("Hi, I am a Guest");
//     }
// }

/*
Static Nested class
Inner Class
Anonymous class --> Lambdas
Local class
*/

//----------------------INPUT OUTPUT---------------------------
// public class opps2{
//     public static void main(String[] args) {
//         System.out.println("Hello");
//         System.err.println("Bye");
//         int age = -3;
//         if(age < 0) {
//             System.err.println("Invalid age");
//         }
//     }
// }
// System class --> PrintStream out
// PrintStream --> println()
// err --> error
// out --> output

// import java.io.IOException;
// public class opps2 {
//     public static void main(String[] args) throws IOException {
//         int x = System.in.read();
//         System.out.println((char)x);
//     }
// }
// A --> 65 --> Binary form of 65

// Scanner class
// import java.util.Scanner;
// public class opps2{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int age = sc.nextInt();
//         String name = sc.nextLine();
//         System.out.println("age = " + age);
//         System.out.println("Name = " + name);
//     }
// }

//IMMUTABLE CLASSES
// public class opps2{
//     public static void main(String[] args) {
//         College college = new College("IIT G", "Assam");
//         Student s1 = new Student(28, "Aditya", college);
//         System.out.println(s1.getCollege().name); // IIT G
//         s1.getCollege().name = "IIT B";
//         System.out.println(s1.getCollege().name); // IIT B
//     }
// }
// (NOt purely immutable)
// final class Student {
//     private final int age;
//     private final String name;
//     private final College college;
//     Student(int age, String name, College college) {
//         this.age = age;
//         this.name = name;
//         this.college = college;
//     }
//     // getters
//     public int getAge() {
//         return this.age;
//     }
//     public String getName() {
//         return this.name;
//     }
//     public College getCollege() {
//         return this.college;
//     }
// }
// // Mutable
// class College {
//     String name;
//     String address;
//     College(String name, String address) {
//         this.name = name;
//         this.address = address;
//     }
// }

// DEFENSIVE COPY
// public class opps2{
//     public static void main(String[] args) {
//         College college = new College("IIT G", "Assam");
//         Student s1 = new Student(28, "Aditya", college);
//         System.out.println(s1.getCollege().name); // IIT G
//         s1.getCollege().name = "IIT B";
//         System.out.println(s1.getCollege().name); // IIT G
//     }
// }
// // Immutable
// // defensive copy of college (non primitive)
// final class Student {
//     private final int age;
//     private final String name;
//     private final College college;
//     Student(int age, String name, College college) {
//         this.age = age;
//         this.name = name;
//         this.college = new College(college.name, college.address);
//     }
//     // getters
//     public int getAge() {
//         return this.age;
//     }
//     public String getName() {
//         return this.name;
//     }
//     public College getCollege() {
//         return new College(this.college.name, this.college.address);
//     }
// }
// // Mutable
// class College {
//     String name;
//     String address;
//     College(String name, String address) {
//         this.name = name;
//         this.address = address;
//     }
// }

//---------------OBJECT CLASS ----------------
// tostring(), equals(), hashcode(), getClass(), finalize(), clone()
// import java.util.Objects;
// public class opps2{
//     public static void main(String[] args) throws CloneNotSupportedException {
//         Student s1 = new Student();
//         s1.name = "Aditya";
//         s1.age = 28;
//         // System.out.println(s1.toString());
//         // System.out.println(s1);

//         Student s2 = new Student();
//         s2.name = "Aditya";
//         s2.age = 28;
//         Student s3 = null;
//         // Integer i = 28;
//         // System.out.println(s1.equals(s1));   //true
//         // System.out.println(s1.equals(s2));      //false as without overriding equals method it will check for reference equality
//         // System.out.println(s1.equals(s3)); // false give  null pointer exception if not handled by overriding

//         // System.out.println(s1.hashCode() == s2.hashCode()); // false as without overriding hashcode method it will check for reference equality
    
//         // System.out.println(s1.getClass().getName());
//         // System.out.println(s2.getClass().getName());
//         // System.out.println(s1 instanceof Object);
    
//         Student s4 = (Student) s1.clone();
//         System.out.println(s4.age);
//         System.out.println(s4.name);
//     }
// }
// // instanceOf operator -> Check if an object is instance of a class or any of its subclass
// // gertClass() method --> returns the runtime class of an object which it is currently pointing to. It returns a Class object which contains the name of the class, its methods, fields, etc.
// // clone method --> creates and returns a shallow copy of the object. It is defined in Object class and is protected. To use it, we need to override it in our class and implement Cloneable interface. If we don't implement Cloneable interface, it will throw CloneNotSupportedException.
// // finalize() method --> is called by the garbage collector before an object is destroyed. It is used to perform cleanup operations like closing files, releasing resources, etc. It is defined in Object class and can be overridden in our class. It is not guaranteed to be called immediately when an object becomes unreachable, so it should not be relied upon for critical cleanup tasks.
// class Student implements Cloneable{
//     String name;
//     int age;
//     @Override
//     public String toString(){
//         return (name + ", " + age);
//     }

//     @Override
//     public boolean equals(Object obj){
//         if(this == obj) return true;
//         if(obj == null) return false;
//         if(getClass() != obj.getClass()){
//             return false;
//             //checking if obj is instance of Student class or not. If not handled then it will give class cast exception while type casting obj to Student
//         }
//         Student s = (Student) obj;
//         return (this.name.equals(s.name) && this.age == s.age);
//     }  

//     @Override
//     public int hashCode(){
//         // isult = result * 31 + age;
//         // result = result * 31 + name.hashCode();
//         // result = result * 31 + (name == null ? 0 : name.hashCode());
//         // return result;
//         return Objects.hash(name, age);
//     }

//     protected Object clone() throws CloneNotSupportedException{
//         return super.clone();
//     }
// }

//----------ENUMS--------------------
// public class opps2{
//     public static void main(String[] args) {
        // int status = PaymentStatus.SUCCESS;

        // System.out.println(status);

        // int status2 = 100;

        // if(status == Role.ADMIN) {

        // }

//         String status = PaymentStatus.SUCCESS;
//         System.out.println(status);

//         if(status == "success") {

//         }
//     }
// }

// payment status --> success, failed, pending
// final

/*
Problems with this approach :
1. Type safety
2. Poor Readability
3. No Grouping od related enitites
*/
// class PaymentStatus {
//     public static final String SUCCESS = "Success";
//     public static final String FAILED = "Failed";
//     public static final String PENDING = "Pending";
// }
// class Role {
//     public static final int USER = 1;
//     public static final int ADMIN = 2;
//     public static final int MANAGER = 2;
// }

// public class opps2{
//     public static void main(String[] args) {
//         //int status = PaymentStatus2.SUCCESS;
//         //PaymentStatus status = PaymentStatus.FAILED;
//         PaymentStatus status = PaymentStatus.FAILED;
//         System.out.println(status.name());
//     }
// }
// // Enum --> Enumerations ( Enumerated type)
// // Enum --> Predefined set of constants.
// enum PaymentStatus {
//     SUCCESS,
//     FAILED,
//     PENDING;
// }
// class PaymentStatus2 {
//     public static final int SUCCESS = 1;
//     public static final int FAILED = 2;
//     public static final int PENDING = 3;
// }

// public class opps2{
//     public static void main(String[] args) {
//         Direction d = Direction.SOUTH;
//         System.out.println(d.getDegree());
//     }
// }
// enum Direction {
//     NORTH(0),
//     SOUTH(180),
//     EAST(90),
//     WEST(270);
//     private int degree;
//     Direction(int degree) {
//         this.degree = degree;
//     }
//     public int getDegree() {
//         return this.degree;
//     }
// }

// public class opps2{
//     public static void main(String[] args) {
//         Direction d = Direction.NORTH;
//         d.move();
//     }
// }
// enum Direction {
//     NORTH {
//         @Override
//         public void move() {
//             System.out.println("Move up (Y + 1)");
//         }
//     },
//     SOUTH {
//         @Override
//         public void move() {
//             System.out.println("Move down (Y - 1)");
//         }
//     },
//     EAST {
//         @Override
//         public void move() {
//             System.out.println("Move right (X + 1)");
//         }
//     },
//     WEST {
//         @Override
//         public void move() {
//             System.out.println("Move left (X - 1)");
//         }
//     };
//     public abstract void move();
// }

// public class opps2{
//     public static void main(String[] args){
        // Direction[] directions = Direction.values();
        // for(Direction d : directions){
        //     System.out.println(d.name());
        // }
//         Direction d = Direction.valueOf("EAST");
//         System.out.println(d.name());
//         // System.out.println(d.toString());
//         System.out.println(d.ordinal());
//     }
// }
// values() --> We can iterate in this enum
// valueOf() --> Convert a String into an enum constant
// name() vs toString() --> tostring can be overridden but name() cannot be overridden
// ordinal() --> returns the position of the enum constant in the enum declaration, starting from 0
// toString(), equals(), hashCode()

// enum Direction{
//     NORTH,
//     SOUTH,
//     EAST,
//     WEST;

//     @Override
//     public String toString(){
//         return "Direction is " + name();
//     }
// }

//--------INTERFACES------------------------
// public class opps2{
//     public static void main(String[] args) {
//         Payment p = new DebitCard();
//         p.pay();
//     }
// }
// //polymorphism
// interface Payment {
//     void pay();
// }
// class CreditCard implements Payment {
//     @Override
//     public void pay() {
//         System.out.println("Paying via credit card");
//     }
// }
// class DebitCard implements Payment {
//     @Override
//     public void pay() {
//         System.out.println("Paying via debit card");
//     }
// }

// public class opps2{
//      public static void main(String[] args) {
//         // MathConstant r1 = new Random();
//         // r1.fun();
//         System.out.println(MathConstant.PI_VALUE);
//     }
// }
// Variables inside interfaces
// interface MathConstant {
//     double PI_VALUE = 3.14;
//     int VALUE = 10;
    //void fun();
// }
// class Random implements MathConstant {
    // @Override
    // public void fun() {
    //     System.out.println(PI_VALUE);
    // }
// }

// public class opps2{
//     public static void main(String[] args) {
        
//     }
// }
// // Multiple Inheritance --> Interfaces
// interface A {
//     void fun();
// }
// interface B {
//     void fun2();
// }
// class C implements A, B {
//     @Override
//     public void fun() {
//     }
//     @Override
//     public void fun2() {       
//     }
// }

// public class opps2{
//     public static void main(String[] args) {
//         Dog d = new StreetDog();
//         d.eat();
//         d.bark();      
//     }
// }
// // Interface inheritance
// interface Animal {
//     void eat();
// } 
// interface Dog extends Animal {
//     void bark();
// }
// class StreetDog implements Dog {
//     @Override
//     public void eat() {
//         System.out.println("Eating");
//     }
//     @Override
//     public void bark() {
//         System.out.println("Barking");
//     }
// }


// public class opps2{
//     public static void main(String[] args) {
//         Vehicle v = new Car();
//         v.drive();
//         //Vehicle.brake();
//     }
// }
// After Java 8 --> Default Methods, Static methods
// From Java 9 -> Private methods
// List Interface --> methods
// interface List {
//     default void pushBack() {
//     }
// }
// interface Vehicle {
//     default void drive() {
//         System.out.println("Vehicle is driving");
//         accelerate();
//     }
//     static void brake() {
//          System.out.println("Vehicle is applying brake");
//     }
//     private void accelerate() {
//         System.out.println("Vehicle is Accelerating");
//     }
// }
// class Car implements Vehicle {
//     // @Override
//     // public void drive() {
//     //     System.out.println("Car is driving");
//     // }
// }

// public class opps2{
//     public static void main(String[] args) {
//         D d = new D();
//         d.fun();
//     }
// }
// // Diamond problem solved by interfaces
// interface A {
//     void fun();
// }
// interface B extends A {
//     default void fun() {
//         System.out.println("B");
//     }
// }
// interface C extends A {
//     default void fun() {
//          System.out.println("C");
//     }
// }
// class D implements B, C {
//     @Override
//     // public void fun(){
//     //     System.out.println("D");
//     // }
//     public void fun() {
//         C.super.fun(); // calling C's fun() method
//         B.super.fun(); // calling B's fun() method
//     }
// }

// public class opps2{
//     public static void main(String[] args) {
//         C c = new C();
//         c.fun();
//     }
// }
// // Java Resolution priority rule
// //1. Class method has higher priority than interface method
// interface A {
//     default void fun() {
//         System.out.println("Inside A interface");
//     }
// }
// class B {
//     public void fun() {
//         System.out.println("Inside B class");
//     }
// }
// class C extends B implements A {
//     @Override
//     public void fun() {
//         System.out.println("Inside C class");
//     }
// }

//------------------------STRING IMMUTABILITY-----------------------------
// public class opps2{
//     public static void main(String[] args) {
//         String s1 = "Ja" + "va"; // Java
//         String s2 = "Java";
//         //System.out.println(s1 == s2); // true 
//         String s3 = "Hello";
//         String s4 = s3 + " World";
//         String s5 = "Hello World";
//         //System.out.println(s4 == s5); // false
//         String s6 = "Hello";
//         String s7 = s6;
//         //System.out.println(s6 == s7); // true
//         String s8 = "Hello";
//         s8 = "World";
//         // System.out.println(s8); // World
//         String s9 = new String("Hello");
//         String s10 = "Hello";
//         System.out.println(s9 == s10); // false
//     }
// }
// //String pool --> Hello
// // Heap --> Hello

// // String pool -> "Hello, " World", "Hello World"
// // Heap --> "Hello World"

