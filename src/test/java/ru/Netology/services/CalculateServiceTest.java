package ru.Netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

class CalculateServiceTest {

    @Test
    public void vacationPart1() {
        CalculateService service = new CalculateService();
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int expected = 3;
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void vacationPart2() {
        CalculateService service = new CalculateService();
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int expected = 2;
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(actual, expected);
    }

    @ParameterizedTest
    @CsvSource({
            "10000,3000,20000,3",
            "100000,60000,150000,2"
    })
    public void vacationPart3(int income, int expenses, int thereShould, int expected) {
        CalculateService service = new CalculateService();
        int actual = service.calculate(income, expenses, thereShould);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/dataFile.csv")
    public void vacationPart4(int income, int expenses, int thereShould, int expected) {
        CalculateService service = new CalculateService();
        int actual = service.calculate(income, expenses, thereShould);
        Assertions.assertEquals(expected, actual);

    }
}
