package Question20.P2;

import Question20.P1.Student;  // Import the Student class from P1 package

public class BTech {
    public static void main(String[] args) {
        Student student = new Student();  // Create an instance of the Student class
        System.out.println("Name : " + student.name);  // Access the public field 'name'
    }
}
