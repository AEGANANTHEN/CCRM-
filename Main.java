package edu.ccrm.cli;

import edu.ccrm.config.AppConfig;
import edu.ccrm.service.StudentService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AppConfig config = AppConfig.getInstance();
        System.out.println("Welcome to Campus Course & Records Manager (CCRM) - vitbhopal");

        Scanner sc = new Scanner(System.in);
        StudentService studentService = new StudentService();
        boolean running = true;

        while (running) {
            System.out.println("\n==== Main Menu ====");
            System.out.println("1. Manage Students");
            System.out.println("6. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline
            switch (choice) {
                case 1 -> studentService.menu();
                case 6 -> {
                    running = false;
                    System.out.println("Exiting... Goodbye!");
                }
                default -> System.out.println("Feature under construction...");
            }
        }
        sc.close();
    }
}
