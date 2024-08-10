/*Simple Student Management System:
•	Create a Student class with attributes like name, roll number, and marks.
•	Implement methods to calculate the average marks, display student details, and check if the student passed or failed 
    (based on a minimum passing percentage).
•	Create an array of Student objects to represent a class and calculate the class average.*/


class Student {
    String name;
    int roll_number;
    int[] marks;
    
    

    public Student(String name, int roll_number,  int[] marks){
        this.name = name;
        this.roll_number = roll_number;
        this.marks = marks;


    }

    public int calculateAvg(){
        int sum=0;

        for (int mark : marks) {
            sum += mark;
        }
        return (int) sum / marks.length;
    }

    public void displayInfo() {
        System.out.println("Name: " + name +""+ "RollNumber: "+ roll_number);
        System.out.println("Average Marks: " + calculateAvg());
    }
}

public class SimpleStudentManagementSystem{
    public static void main(String[] args) {

        int[] marks = {85, 90, 78, 92, 88};
        Student s1 = new Student("Ali :", 01, marks);
        s1.displayInfo();
        s1.calculateAvg();
        

    }
}