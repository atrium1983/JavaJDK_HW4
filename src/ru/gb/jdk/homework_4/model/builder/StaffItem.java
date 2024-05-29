package ru.gb.jdk.homework_4.model.builder;

import java.time.LocalDate;

public interface StaffItem<T> {
    int getId();
    String getPhoneNumber();
    String getLastName();
    String getFirstName();
    String getMiddleName();
    LocalDate getDateOfStartService();
    int getLengthOfService();
    int getPeriod(LocalDate start, LocalDate end);
    String getInfo();
}
