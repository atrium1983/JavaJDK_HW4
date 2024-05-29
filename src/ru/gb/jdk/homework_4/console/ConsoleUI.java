package ru.gb.jdk.homework_4.console;

import ru.gb.jdk.homework_4.model.Service;

public class ConsoleUI {
    private final Service service;
    public ConsoleUI() {
        service = new Service();
    }

    public void generateStaff(){
        service.generateStaff();
        System.out.println("Сгенерированный список сотрудников компании\n");
        System.out.println(service.printFullInfo());
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }

    public void addEmployee(String lastName, String firstName, String middleName, String phoneNumber){
        service.addEmployee(lastName, firstName, middleName, phoneNumber);
        System.out.println("Сотрудник успешно добавлен");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(service.printFullInfo());
    }

    public void findById (int id){
        if(service.findById(id) == null){
            System.out.println("Сотрудник с табельным номером " + id + " не найден");
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        } else {
            System.out.println("С табельным номером " + id + " найден следующий сотрудник:");
            System.out.println(service.findById(id));
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        }
    }

    public void findByLengthOfService(int howLong){
        if(service.findByLengthOfService(howLong) == null){
            System.out.println("Сотрудники со стажем " + howLong + " год(а)/лет не найдены");
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        } else {
            System.out.println("Следующие сотрудники имеют стаж работы " +howLong + " год(а)/лет:");
            System.out.println(service.findByLengthOfService(howLong).toString().replace("[", "").replace("]", ""));
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        }
    }

    public void findPhoneByName(String lastName, String firstName, String middleName){
        if(service.findPhoneByName(lastName, firstName, middleName) == null){
            System.out.println("Сотрудник с именем " + lastName + " " + firstName + " " + middleName + " не найден");
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        } else {
            System.out.println("Телефон сотрудника " + lastName + " " + firstName + " " + middleName + " следующий:");
            System.out.println(service.findPhoneByName(lastName, firstName, middleName).toString().replace("[", "").replace("]", ""));
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        }
    }

    public void findPhoneByName(String lastName){
        if(service.findPhoneByName(lastName) == null){
            System.out.println("Сотрудник(и) с фамилией " + lastName + " не найден(ы)");
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        } else {
            System.out.println("Телефон(ы) сотрудник(а/ов) с фамилией " + lastName + " следующи(й/е):");
            System.out.println(service.findPhoneByName(lastName).toString().replace("[", "").replace("]", ""));
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        }
    }
}
