package ru.netology.javaqa.HomeWork6.services;


public class AnalyticalService {

    public int allMonthsAmountCalc(long[] monthsArr) {
        int totalAmount = 0;

        for (long amount : monthsArr) {
            totalAmount += amount;
        }
        return totalAmount;
    };

    public int averageAmountCalc(long[] monthsArr) {
        int averageAmount = 0;
        for (long am : monthsArr) {
            averageAmount += am;
        }

        return averageAmount / monthsArr.length;
    };

    public int maxAmountMonthSeek(long[] monthsArr) {
        int monthCount = 0;

        for (int i = 0; i < monthsArr.length; i++) {
            if (monthsArr[i] >= monthsArr[monthCount]) {
                monthCount = i;
            }
        }
        return monthCount + 1;
    };

    public int minAmountMonthSeek(long[] monthsArr) {
        int monthCount = 0;

        for (int i = 0; i < monthsArr.length; i++) {
            if (monthsArr[i] <= monthsArr[monthCount]) {
                monthCount = i;
            }
        }
        return monthCount + 1;
    };

    public int findBelowMonthsQuantity(long[] monthsArr) {
        int average = averageAmountCalc(monthsArr);
        int monthsQuatity = 0;

        for (long min : monthsArr) {
            if (min < average) {
                monthsQuatity++;
            }
        }

        return monthsQuatity;
    };

    public int findHigherMonthsQuantity(long[] monthsArr) {
        int average = averageAmountCalc(monthsArr);
        int monthsQuatity = 0;

        for (long max : monthsArr) {
            if (max > average) {
                monthsQuatity++;
            }
        }

        return monthsQuatity;
    };
}