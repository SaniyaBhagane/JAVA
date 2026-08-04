
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
public class oops2{
        public static void main(String[] args){
                Car fcar = new FuelCar();
                Car ecar = new ElectricCar();
                fcar.start();
                fcar.accelerate();
                fcar.brake();
                ecar.accelerate();
                ecar.brake();
        }
}

abstract class Car{
        void start(){
                System.out.println("Car started.");
        }
        abstract void accelerate();
        abstract void brake();
}
class FuelCar extends Car{
        @Override
        void accelerate(){
                System.out.println("Fuel car accelerated.");
        }
        void brake(){
                System.out.println("Fuel car stopped.");
        }
}
class ElectricCar extends Car{
        @Override
        void accelerate(){
                System.out.println("Electric car accelerated.");
        }
        void brake(){
                System.out.println("Electric car stopped.");
        }
}