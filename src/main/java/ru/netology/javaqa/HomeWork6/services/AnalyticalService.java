package ru.netology.javaqa.HomeWork6.services;


public class AnalyticalService {

    public long allMonthsAmountCalc(long[] amountsByMonth) {
        long totalAmount = 0;

        for (long amount : amountsByMonth) {
            totalAmount += amount;
        }
        return totalAmount;
    }

    public long averageAmountCalc(long[] amountsByMonth) {
        long averageAmount = 0;
        for (long am : amountsByMonth) {
            averageAmount += am;
        }

        return averageAmount / amountsByMonth.length;
    }

    public int maxAmountMonthSeek(long[] amountsByMonth) {
        int monthCount = 0;

        for (int i = 0; i < amountsByMonth.length; i++) {
            if (amountsByMonth[i] >= amountsByMonth[monthCount]) {
                monthCount = i;
            }
        }
        return monthCount + 1;
    }

    public int minAmountMonthSeek(long[] amountsByMonth) {
        int monthCount = 0;

        for (int i = 0; i < amountsByMonth.length; i++) {
            if (amountsByMonth[i] <= amountsByMonth[monthCount]) {
                monthCount = i;
            }
        }
        return monthCount + 1;
    }

    public int findBelowMonthsQuantity(long[] amountsByMonth) {
        long average = averageAmountCalc(amountsByMonth);
        int monthsQuatity = 0;

        for (long min : amountsByMonth) {
            if (min < average) {
                monthsQuatity++;
            }
        }

        return monthsQuatity;
    }

    public int findHigherMonthsQuantity(long[] amountsByMonth) {
        long average = averageAmountCalc(amountsByMonth);
        int monthsQuatity = 0;

        for (long max : amountsByMonth) {
            if (max > average) {
                monthsQuatity++;
            }
        }

        return monthsQuatity;
    }
}