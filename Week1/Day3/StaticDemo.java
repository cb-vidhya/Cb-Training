/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cb.Week1.Day3;

/**
 *
 * @author cb-vidhya
 */
import java.util.ArrayList;
import java.util.Scanner;
class Student
{
    static int studentId;
    static String studentName;
    static char gender;
    static Subject subjects=new Subject();
    void setStudentId(int studentId)
    {
        this.studentId=studentId;
    }
    int getStudentId()
    {
        return studentId;
    }
    void setStudentName(String studentName)
    {
        this.studentName=studentName;
    }
    String getStudentName()
    {
        return studentName;
    }
    void setGender(char gender)
    {
        this.gender=gender;
    }
    char getGender()
    {
        return gender;
    }
}
class Subject
{
    String subject1;
    float marks1;
    String subject2;
    float marks2;
    String subject3;
    float marks3;
    void setMarks1(float marks1)
    {
        this.marks1=marks1;
    }
    float getMarks1()
    {
        return marks1;
    }
    void setMarks2(float marks2)
    {
        this.marks2=marks2;
    }
    float getMarks2()
    {
        return marks2;
    }
    void setMarks3(float marks3)
    {
        this.marks3=marks3;
    }
    float getMarks3()
    {
        return marks3;
    }
    void setSubject1(String subject1)
    {
        this.subject1=subject1;
    }
    String getSubject1()
    {
        return subject1;
    }
    void setSubject2(String subject2)
    {
        this.subject2=subject2;
    }
    String getSubject2()
    {
        return subject2;
    }
    void setSubject3(String subject3)
    {
        this.subject3=subject3;
    }
    String getSubject3()
    {
        return subject3;
    }
}
class ResultGenerator
{
    float total,average;
    void generateResult(Student student)
    {
        System.out.println("Id: "+student.getStudentId());
        System.out.println("Name: "+student.getStudentName());
        total=student.subjects.marks1+student.subjects.marks2+student.subjects.marks3;
        System.out.println("Total: "+total);
        average=(float)(total/3.0);
        System.out.println("Average: "+average);
    }
}
class StudentDemo
{
    static  ArrayList<Student> list=new ArrayList<Student>();
    void storeStudentData(Student student)
    {
        System.out.println("Report card is");
        ResultGenerator result=new ResultGenerator();
        result.generateResult(student);
    }
}
public class StaticDemo {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        char choice;
        StudentDemo demo=new StudentDemo();
        Student students=new Student();
        do
        {
            System.out.println("Enter the name of the student");
            String studentName=scan.next();
            students.setStudentName(studentName);
            System.out.println("Enter the id of the student");
            int studentId=scan.nextInt();
            scan.nextLine();
            students.setStudentId(studentId);
            System.out.println("Enter the name of subject1");
            String subject1=scan.nextLine();
            students.subjects.setSubject1(subject1);
            System.out.println("Enter the name of subject2");
            String subject2=scan.nextLine();
            students.subjects.setSubject2(subject2);
            System.out.println("Enter the name of subject3");
            String subject3=scan.nextLine();
            students.subjects.setSubject3(subject3);
            System.out.println("Enter the marks of subject1");
            float marks1=scan.nextFloat();
            students.subjects.setMarks1(marks1);
            System.out.println("Enter the marks of subject2");
            float marks2=scan.nextFloat();
            students.subjects.setMarks2(marks2);
            System.out.println("Enter the marks of subject3");
            float marks3=scan.nextFloat();
            students.subjects.setMarks3(marks3);
            demo.storeStudentData(students);
            System.out.println("Do you want to create more students?(Y/N)");
            choice=scan.next().charAt(0);
            scan.nextLine();  
        }while(choice=='Y');
    }
}
