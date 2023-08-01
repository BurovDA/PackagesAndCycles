package ru.Netology.services;

public class CalculateService {
    public int calculate(int income, int expenses, int thereShould) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0;
        for (int month = 0; month < 12; month++) {
            if (money >= thereShould) {// можем ли отдыхать?
                money = money - expenses;
                money = money / 3;
                count++;
            } else {
                money = money + income;
                money = money - expenses;
            }
        }
        return count;
    }
}

