package com.pipeline.processing.data.dataconsumer.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "userdata")
public class UserData {

    @Id
    private int userId;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String shortResume;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getShortResume() {
        return shortResume;
    }

    public void setShortResume(String shortResume) {
        this.shortResume = shortResume;
    }

}