import java.util.Scanner;

interface MathClass {
     void mathClassDetails();
}

interface ScienceClass {
     void scienceClassDetails();
}

interface EnglishClass {
     void englishClassDetails();
}

class Student implements MathClass, ScienceClass, EnglishClass {
     private String name;
     private int mathHours, sciHours, engHours;

     // Constructor to initialize student details
     public Student(String name, int mathHours, int sciHours, int engHours) {
          this.name = name;
          this.mathHours = mathHours;
          this.sciHours = sciHours;
          this.engHours = engHours;
     }

     // Implementing method from MathClass interface
     @Override
     public void mathClassDetails() {
          System.out.println(name + " has enrolled Math class for " + mathHours + " hours.");
     }

     // Implementing method from ScienceClass interface
     @Override
     public void scienceClassDetails() {
          System.out.println(name + " has enrolled Science class for " + sciHours + " hours.");
     }

     // Implementing method from EnglishClass interface
     @Override
     public void englishClassDetails() {
          System.out.println(name + " has enrolled English class for " + engHours + " hours.");
     }

     // Method to display all details
     public void displayDetails() {
          mathClassDetails();
          scienceClassDetails();
          englishClassDetails();
     }
}

public class Driver {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

          // Taking input from the user
          System.out.print("Enter your name: ");
          String name = sc.next();

          System.out.print("Enter the number of hours for Math: ");
          int mathHours = sc.nextInt();

          System.out.print("Enter the number of hours for Science: ");
          int sciHours = sc.nextInt();

          System.out.print("Enter the number of hours for English: ");
          int engHours = sc.nextInt();

          // Creating Student object
          Student s = new Student(name, mathHours, sciHours, engHours);

          // Displaying student enrollment details
          System.out.println("\nDetails of Enrolled Student:");
          s.displayDetails();

          sc.close();
     }
}
