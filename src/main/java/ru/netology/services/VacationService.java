package ru.netology.services;

public class VacationService {

    public int calculate(int income, int expenses, int threshold) {
        int money = 0; // сколько денег на счету
        int count = 0; // счётчик месяцев отдыха
        for (int i = 0; i < 12; i++) {
            if (money >= threshold) {
                // отдыхаем
                money = money - expenses;
                money = money / 3;
                count++;

            } else {
                // работаем
                money = money + income;
                money = money - expenses;
            }

        }
        return count;

    }
}
