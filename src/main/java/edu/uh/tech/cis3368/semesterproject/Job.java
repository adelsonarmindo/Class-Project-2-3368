package edu.uh.tech.cis3368.semesterproject;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Job {
    private int id;
    private String lastName;
    private String firstName;
    private String email;
    private Integer phoneNumber;

    @Id
    @Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "LAST_NAME", nullable = false, length = 24)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "FIRST_NAME", nullable = false, length = 24)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "EMAIL", nullable = true, length = 24)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "PHONE_NUMBER", nullable = true)
    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id &&
                Objects.equals(lastName, job.lastName) &&
                Objects.equals(firstName, job.firstName) &&
                Objects.equals(email, job.email) &&
                Objects.equals(phoneNumber, job.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, lastName, firstName, email, phoneNumber);
    }
}
