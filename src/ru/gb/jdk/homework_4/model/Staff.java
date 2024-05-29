package ru.gb.jdk.homework_4.model;

import ru.gb.jdk.homework_4.model.builder.StaffItem;

import java.util.ArrayList;
import java.util.Objects;

public class Staff<E extends StaffItem<E>> {
    private ArrayList<E> staff;

    public Staff(){
        staff = new ArrayList();
    }

    public void addStaff(E[] staff){
        for (E employee : staff) {
            addEmployee(employee);
        }
    }
    public void addEmployee(E employee){
        staff.add(employee);
    }

    public E getById (int id) {
        for (E employee : staff) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    public String getInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Всего сотрудников => ");
        sb.append((staff.size()));
        sb.append(" \n");
        for (E employee: staff) {
            sb.append(employee);
            sb.append("\n");
        }
        return sb.toString();
    }

    public String getEmployeeInfo(int id) {
        StringBuilder sb = new StringBuilder();
        sb.append(getById(id));
        sb.append("\n");
        return sb.toString();
    }

    public E findById(int id) {
        for (E employee : staff) {
            if (employee.getId() == id)
                return employee;
        }
        return null;
    }

    public ArrayList<E> findByLengthOfService(int howLong) {
        ArrayList<E> staffByPeriod = new ArrayList<>();
        for (E employee : staff) {
            if (employee.getLengthOfService() == howLong){
                staffByPeriod.add(employee);
            }
        }
        return staffByPeriod;
    }

    public ArrayList<String> findPhoneByName(String lastName, String firstName, String middleName){
        ArrayList<String> phoneNumbers = new ArrayList<>();
        for (E employee : staff) {
            if (Objects.equals(employee.getLastName(), lastName) && Objects.equals(employee.getFirstName(), firstName) && Objects.equals(employee.getMiddleName(), middleName)) {
                phoneNumbers.add(employee.getPhoneNumber());
            }
        }
        return phoneNumbers;
    }

    public ArrayList<String> findPhoneByName(String lastName){
        ArrayList<String> phoneNumbers = new ArrayList<>();
        for (E employee : staff) {
            if (Objects.equals(employee.getLastName(), lastName)) {
                phoneNumbers.add(employee.getPhoneNumber());
            }
        }
        return phoneNumbers;
    }
}