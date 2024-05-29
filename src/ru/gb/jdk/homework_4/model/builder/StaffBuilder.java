package ru.gb.jdk.homework_4.model.builder;

import ru.gb.jdk.homework_4.model.Employee;
import ru.gb.jdk.homework_4.model.Staff;

import java.time.LocalDate;

public class StaffBuilder {
    private int currentId = 7;
    public Employee buildEmployee(String lastName, String firstName, String middleName, String phoneNumber){
        return new Employee(currentId++, lastName, firstName, middleName, phoneNumber, LocalDate.now());
    }

    public Staff generateStaff() {
        Staff staff = new Staff();
        Employee[] arrayOfstaff = {new Employee(1,"Иванов", "Иван", "Иванович",  "79255813223", LocalDate.of(1973,10,2)),
                new Employee(2,"Петров", "Пётр", "Петрович", "79051234567", LocalDate.of(2001,6,30)),
                new Employee(3,"Екатеринова", "Екатерина", "Екатериновна", "79255813223", LocalDate.of(1963,5,7)),
                new Employee(4,"Тарасов", "Тарас", "Тарасович", "79033244556", LocalDate.of(1999,3,21)),
                new Employee(5,"Ольгова", "Ольга", "Ольговна", "79012237879", LocalDate.of(2001,6,30)),
                new Employee(6,"Владимиров", "Владимир", "Владимирович", "79150803023", LocalDate.of(1973,9,15))
        };
        staff.addStaff(arrayOfstaff);

        return staff;
    }
}