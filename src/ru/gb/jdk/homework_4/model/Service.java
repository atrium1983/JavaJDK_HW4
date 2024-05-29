package ru.gb.jdk.homework_4.model;

import ru.gb.jdk.homework_4.model.builder.StaffBuilder;

import java.util.ArrayList;

public class Service {
    private Staff<Employee> staff;
    private final StaffBuilder builder;

    public Service() {
        staff = new Staff();
        builder = new StaffBuilder();
    }

    public void addEmployee(String lastName, String firstName, String middleName, String phoneNumber){
        Employee employee = builder.buildEmployee(lastName, firstName, middleName, phoneNumber);
        staff.addEmployee(employee);
    }

    public void generateStaff(){
        staff = builder.generateStaff();
    }

    public String printFullInfo() {
        return staff.getInfo();
    }

    public Employee findById(int id){
        if(staff.findById(id) != null) {
            return staff.findById(id);
        }
            return null;
    }

    public ArrayList<Employee> findByLengthOfService(int howLong){
        if(!staff.findByLengthOfService(howLong).isEmpty()){
            return staff.findByLengthOfService(howLong);
        }
        return null;
    }

    public ArrayList<String> findPhoneByName(String lastName, String firstName, String middleName){
        if(!staff.findPhoneByName(lastName, firstName, middleName).isEmpty()){
            return staff.findPhoneByName(lastName, firstName, middleName);
        }
        return null;
    }

    public ArrayList<String> findPhoneByName(String lastName){
        if(!staff.findPhoneByName(lastName).isEmpty()){
            return staff.findPhoneByName(lastName);
        }
        return null;
    }
}
