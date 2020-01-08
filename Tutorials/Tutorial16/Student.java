package Tutorials.Tutorial16;

public class Student extends Person {

    private int studentID;
    private int grade;
    private double gpa;

    public int getStudentID() {
        return studentID;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public Student(String name, int age, int height, int weight, int studentID, int grade, double gpa) {
        super(name, age, height, weight);
        this.studentID = studentID;
        this.grade = grade;
        this.setGpa(gpa);
    }

    public void show(){
        System.out.println("----------------------------------");
        System.out.println("Name : " + getName());
        System.out.println("Age : " + getAge());
        System.out.println("Height : " + getHeight());
        System.out.println("Weight : " + getWeight());
        System.out.println("ID : " + getStudentID());
        System.out.println("Grade : " + getGrade());
        System.out.println("GPA : " + getGpa());
        
    }

}