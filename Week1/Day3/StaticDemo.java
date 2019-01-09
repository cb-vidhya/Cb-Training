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
    private int studentId;
    private String studentName;
    private char gender;
    public Subject subjects=new Subject();
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
    private String subject1;
    private float marks1;
    private String subject2;
    private float marks2;
    private String subject3;
    private float marks3;
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
    static void generateResult(ArrayList<Student> student)
    {
        float total;
        float average;
        int count=1;
        for(Student s:student)
        {
            System.out.println("Report card for Student "+count++);
            System.out.println("Id: "+s.getStudentId());
            System.out.println("Name: "+s.getStudentName());
            total=s.subjects.getMarks1()+s.subjects.getMarks2()+s.subjects.getMarks3();
            System.out.println("Total: "+total);
            average=(float)(total/3.0);
            System.out.println("Average: "+average); 
        }
    }
}
class StudentDemo
{
    static private ArrayList<Student> list=new ArrayList<>();
    void storeStudentData(Student student)
    {
        list.add(student); 
    }
    void display()
    {
        ResultGenerator result=new ResultGenerator();
        result.generateResult(list);
        System.out.println("hello"+list.get(0));
    }
    
}
public class StaticDemo {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        char choice;
        do
        {
            Student students=new Student();
            StudentDemo demo=new StudentDemo();
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
            students.subjects.setMarks3(marks3);System.out.println("called");
            demo.storeStudentData(students);
            System.out.println("Do you want to create more students?(Y/N)");
            choice=scan.next().charAt(0);
            scan.nextLine();  
        }while(choice=='Y');
        new StudentDemo().display();
    }
}
