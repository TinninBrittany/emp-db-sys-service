package com.employeedatabasesystem.service.model;

import java.util.Objects;

public class EmployeeData {
    private Long id;
    private String firstName;
    private String lastName;
    private String emailId;

    public EmployeeData() {
    }

    public EmployeeData(String firstName, String lastName, String emailId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmployeeData)) return false;
        EmployeeData that = (EmployeeData) o;
        return Objects.equals(id, that.id) && Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && Objects.equals(emailId, that.emailId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, emailId);
    }

    @Override
    public String toString() {
        return "EmployeeData{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailId='" + emailId + '\'' +
                '}';
    }
}


