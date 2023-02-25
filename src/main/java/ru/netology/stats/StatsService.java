package ru.netology.stats;

public class StatsService {

    public long sumAllSales(long[] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;

    }

    public long mediumSales(long[] sales) {
        long medium = 0;
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        medium = sum / sales.length;
        return medium;

    }

    public int maxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как минимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public long monthLessThanMedium(long[] sales) {
        long medium = 0;
        long month = 0;
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        medium = sum / sales.length;
        for (int j = 0; j < sales.length; j++) {
            if (sales[j] < medium) {
                month = month + 1;
            }
        }
        return month;

    }

    public long monthMoreThanMedium(long[] sales) {
        long medium = 0;
        long month = 0;
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        medium = sum / sales.length;
        for (int j = 0; j < sales.length; j++) {
            if (sales[j] > medium) {
                month = month + 1;
            }
        }
        return month;

    }
}
