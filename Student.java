package edu.ccrm.domain;

import java.time.LocalDate;

public class Student extends Person {
    private String regNo;
    private String email;
    private boolean active;
    private LocalDate enrollmentDate;

    public Student(String id, String fullName, String regNo, String email) {
        super(id, fullName);
        this.regNo = regNo;
        this.email = email;
        this.active = true;
        this.enrollmentDate = LocalDate.now();
    }

    public String getRegNo() { return regNo; }
    public String getEmail() { return email; }
    public boolean isActive() { return active; }
    public void deactivate() { this.active = false; }

    @Override
    public String toString() {
        return "Student: " + getFullName() + " (" + regNo + "), Email: " + email;
    }
}
