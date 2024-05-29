package ru.gb.jdk.homework_4;

import ru.gb.jdk.homework_4.console.ConsoleUI;

public class Main {
    public static void main(String[] args) {
        ConsoleUI console = new ConsoleUI();

        // Генерация списка сотрудников
        console.generateStaff();
        // Добавление нового сотрудника. Табельный номер будет присвоен автоматически
        console.addEmployee("Иванов", "Пётр", "Тарасович", "79866786767");
        // Поиск сотрудника по табельному номеру
        console.findById(5);
        // Поиск сотрудника или сотрудников со стажем 50 лет (вывод - 2 сотрудника)
        console.findByLengthOfService(50);
        // Поиск номера телефона сотрудника по ФИО (вывод - 1 номер)
        console.findPhoneByName("Иванов", "Иван", "Иванович");
        // Поиск номера телефонов сотрудников с фамилией Иванов (вывод - 2 номера) - хотел попробовать реализацию
        // одного метода с разным количеством параметров (ФИО или только фамилия)
        console.findPhoneByName("Иванов");
    }
}
