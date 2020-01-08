package Tutorials.Tutorial17;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("What is the number of students?");
        int number = scan.nextInt();
        Student[] students = new Student[number];
        for(int i = 0; i < number; i++){

            String name;
            int age;
            int height;
            int weight;
            int studentID;
            int grade;
            double gpa;

            System.out.print("Input name of student"+"("+(i+1)+")");
            name = scan.next();
            System.out.print("Input age of student"+"("+(i+1)+")");
            age = scan.nextInt();
            System.out.print("Input height of student"+"("+(i+1)+")");
            height = scan.nextInt();
            System.out.print("Input weight of student"+"("+(i+1)+")");
            weight = scan.nextInt();
            System.out.print("Input studentID of student"+"("+(i+1)+")");
            studentID = scan.nextInt();
            System.out.print("Input grade of student"+"("+(i+1)+")");
            grade = scan.nextInt();
            System.out.print("Input gpa of student"+"("+(i+1)+")");
            gpa = scan.nextDouble();

            students[i] = new Student(name, age, height, weight, studentID, grade, gpa);
        }
        scan.close();
        for(int i = 0; i < number; i++){
            students[i].show();
        }
                
    }
}