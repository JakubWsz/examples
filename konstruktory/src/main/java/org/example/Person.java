package org.example;

import java.time.LocalDate;
import java.util.UUID;

public class Person {

    private String id;
    private String firstname;
    private String lastname;
    private LocalDate birthdate;
    private Address address; //kompozycja
    private String email;
    private String phoneNumber;

    public Person() {
    }

    public Person(String id, String firstname, String lastname, LocalDate birthdate, Address address, String email,
                  String phoneNumber) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthdate = birthdate;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Person(String firstname, String lastname, LocalDate birthdate, Address address, String email,
                  String phoneNumber) {
        this.id = generateId();
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthdate = birthdate;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Person updatePerson(String firstname) {
        this.setFirstname(firstname);
        return this;
    }

    public Person updatePerson(String firstname,String lastname) {
        this.setFirstname(firstname);
        this.setLastname(lastname);
        return this;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    private String generateId() {
        return UUID.randomUUID().toString();
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", birthdate=" + birthdate +
                ", address=" + address +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
