package ru.gb.jdk.homework_4.model;

import ru.gb.jdk.homework_4.model.builder.StaffItem;

import java.time.LocalDate;
import java.time.Period;

public class Employee implements StaffItem<Employee> {
    private int id;
    private String lastName;
    private String firstName;
    private String middleName;
    private String phoneNumber;
    private LocalDate dateOfStartService;

    public Employee(int id, String lastName, String firstName, String middleName, String phoneNumber, LocalDate dateOfStartWorking) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.dateOfStartService = dateOfStartWorking;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public LocalDate getDateOfStartService() {
        return dateOfStartService;
    }

    public void setDateOfStartService(LocalDate dateOfStartService) {
        this.dateOfStartService = dateOfStartService;
    }

    public int getLengthOfService() {
        return getPeriod(getDateOfStartService(), LocalDate.now());
    }

    public int getPeriod(LocalDate start, LocalDate end){
        Period difference = Period.between(start, end);
        return difference.getYears();
    }

    public String getInfo(){
        return "Табельный номер: " +
                getId() +
                "| Фамилия: " +
                getLastName() +
                ", имя: " +
                getFirstName() +
                ", отчество: " +
                getMiddleName() +
                "| Телефон: " +
                getPhoneNumber() +
                "| Стаж: " +
                getLengthOfService();
    }

    @Override
    public String toString(){
        return getInfo();
    }
}
