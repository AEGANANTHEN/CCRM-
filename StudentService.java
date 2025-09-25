package edu.ccrm.service;

import edu.ccrm.domain.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService {
    private List<Student> students = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void menu() {
        boolean back = false;
        while (!back) {
            System.out.println("\n--- Student Menu ---");
            System.out.println("1. Add Student");
            System.out.println("2. List Students");
            System.out.println("3. Back to Main Menu");
            System.out.print("Choose: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1 -> addStudent();
                case 2 -> listStudents();
                case 3 -> back = true;
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    private void addStudent() {
        System.out.print("Enter ID: ");
        String id = sc.nextLine();
        System.out.print("Enter Full Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Reg No: ");
        String regNo = sc.nextLine();
        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        Student s = new Student(id, name, regNo, email);
        students.add(s);
        System.out.println("Student added successfully!");
    }

    private void listStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
        } else {
            System.out.println("\n--- Student List ---");
            students.forEach(System.out::println);
        }
    }
}
