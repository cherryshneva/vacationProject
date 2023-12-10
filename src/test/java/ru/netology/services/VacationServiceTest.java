package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class VacationServiceTest {
    //  @Test
    // public void calculationCase1() {
    //    VacationService service = new VacationService();
    //   int actual = service.calculate(10_000, 3_000, 20_000);
    //   int expected = 3;

    //   Assertions.assertEquals(expected, actual);

    //  }

    // @Test
    // public void calculationCase2() {
    //   VacationService service = new VacationService();
    //   int actual = service.calculate(100_000, 60_000, 150_000);
    //    int expected = 2;

    //  Assertions.assertEquals(expected, actual);


    // }

    @ParameterizedTest
    @CsvSource({
            "10_000,3_000,20_000,3",
            "100_000,60_000,150_000,2"
    })
    public void testWithParams(int income, int expenses, int threshold, int expected) {
        VacationService service = new VacationService();
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);


    }

}