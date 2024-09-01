package ru.netology.javaqa.HomeWork6.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class AnalyticalServiceTest {
    long[] amountsPerMonths = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    AnalyticalService service = new AnalyticalService();


    @Test
    public void testAllMonthsAmountCalc() {
        int actual = service.allMonthsAmountCalc(amountsPerMonths);
        int expected = 180;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAverageAmountCalc() {
        long actual = service.averageAmountCalc(amountsPerMonths);
        int expected = 15;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMaxAmountMonthSeek() {
        int actual = service.maxAmountMonthSeek(amountsPerMonths);
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMinAmountMonthSeek() {
        int actual = service.minAmountMonthSeek(amountsPerMonths);
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testFindBelowMonthsQuantity() {
        int actual = service.findBelowMonthsQuantity(amountsPerMonths);
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testFindHigherMonthsQuantity() {
        int actual = service.findHigherMonthsQuantity(amountsPerMonths);
        int expected = 5;

        Assertions.assertEquals(expected, actual);

    }

}