public class OOPS {
//     public static void main(String[] args) {
//         Student s1 = new Student();
//         Student s2 = new Student();

//         s1.name = "Aditya";
//         s1.age = 28;
//         s1.rollNo = 101;
//         s1.CollegeName = "IIT";
        
//         s2.name = "Rohit";
//         s2.age =28;
//         s2.rollNo = 102;
//         s2.CollegeName = "IIT";

//         s1.markAttendence();
//         s2.markAttendence();

//         s1.print();
//         s2.print();
//     }
// }

// class Student{
//     String name;
//     int age;
//     int rollNo;
//     String CollegeName;
//     void markAttendence(){
//         System.out.println("Attendence Marked by " + name);
//     }
//     void print(){
//         System.out.println(name + " " + age + " " + rollNo + " " + CollegeName);
//     }

// // ----------------CONSTRUCTOR-----------
//  public static void main(String[] args) {
        
//        Student s1 = new Student();
//        s1.name = "Aditya";
//        s1.age = 28;
//        s1.rollNumber = 101;
//        s1.college = "IIT Guwahati"; 

//        // Constructors --> To create an Object

//        System.out.println(s1.name);
//        System.out.println(s1.age);
//        System.out.println(s1.rollNumber);
//        System.out.println(s1.college);

//         // int x; // local variable --> NO default values
//         // System.out.println(x);

//     }
// }

/*
Integer --> 0
floating --> 0.0
Boolean --> false
String --> null (nothing)

*/

// class Student {
//     String name; // information/data/characteristics --> instance variables
//     int age; 
//     int rollNumber;
//     String college;

//     void markAttendance() { // behaviours --> functions --> instance methods
//         System.out.println("Attendance marked for student " + name);
//     }   


    // public static void main(String[] args) {
    //     Student s1 = new Student("Rohit", 28, 102, "IIT G");

    //     System.out.println(s1.name);
    //     System.out.println(s1.age);
    //     System.out.println(s1.rollNumber);
    //     System.out.println(s1.college);

    //     Student s2 = new Student();
    //     }
    // }

    // class Student {
    //     String name; 
    //     int age; 
    //     int rollNumber;
    //     String college;

    //     // default connstructor
    //     Student() {
    //     }

    //     Student(String n, int a, int rn, String c) {
    //         name = n;
    //         age = a;
    //         rollNumber = rn;
    //         college = c;
    //     }


//     public static void main(String[] args) {
//         Student s1 = new Student();
//         // Student s2 = new Student("Aditya");
//         // Student s3 = new Student("Rohit", 28);
//         // Student s4 = new Student("Rohan", 30, 103);
//         // Student s5 = new Student("Mohan", 31, 104, "IIT Bombay");

//         System.out.println(s1.name);
//         System.out.println(s1.age);
//         System.out.println(s1.rollNumber);
//         System.out.println(s1.college);
//     }
// }
// // Constructor chaining
// class Student {
//     String name; 
//     int age; 
//     int rollNumber;
//     String college;

//     Student() {
//         this("Unknown");
//         System.out.println("I am in first constructor");
//     }

//     Student(String name) {
//         this(name, 0);
//         System.out.println("I am in second constructor");
//     }

//     Student(String name, int age) {
//         this(name, age, 0);
//          System.out.println("I am in third constructor");
//     }

//     Student(String name, int age, int rollNumber) {
//         this(name, age, rollNumber, "Unknown");
//         System.out.println("I am in fourth constructor");
//     }

//     Student(String name, int age, int rollNumber, String college) {
//         this.name = name;
//         this.age = age;
//         this.rollNumber = rollNumber;
//         this.college = college;

//         System.out.println("I am in fifth constructor");
//     }

    
}
