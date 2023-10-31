package com.employeemanagement.demo.employee;

import jakarta.persistence.Entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "EmployeeDetails")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EmployeeNumber")
    private int employeeNumber;

    @Column(name = "FirstName", nullable = false)
    private String firstName;

    @Column(name = "Surname", nullable = false)
    private String surname;

    @Column(name = "UserName", nullable = false)
    private String userName;

    @Column(name = "Email", nullable = false)
    private String email;

    @Column(name = "Gender", nullable = false)
    private String gender;

    @Column(name = "Office", nullable = false)
    private String office;

    @Column(name = "JobTitle", nullable = false)
    private String jobTitle;

    @Column(name = "CapturedByName", nullable = false)
    private String capturedByName;

    @Column(name = "CaptureDate", nullable = false)
    private LocalDate captureDate;

    @Column(name = "CaptureTime", nullable = false)
    private LocalTime captureTime;

    // Constructors, getters, and setters

    public Employee() {
    }

    // Add additional constructors if needed

    // Getters and Setters

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCapturedByName() {
        return capturedByName;
    }

    public void setCapturedByName(String capturedByName) {
        this.capturedByName = capturedByName;
    }

    public LocalDate getCaptureDate() {
        return captureDate;
    }

    public void setCaptureDate(LocalDate captureDate) {
        this.captureDate = captureDate;
    }

    public LocalTime getCaptureTime() {
        return captureTime;
    }

    public void setCaptureTime(LocalTime captureTime) {
        this.captureTime = captureTime;
    }
}