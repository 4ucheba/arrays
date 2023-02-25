package ru.netology.stats;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
// import ru.netology.stats.StatsService;

public class StatsServiceTest {

    @Test
    void CalcSummaryAllSales() {
        StatsService service = new StatsService();

        // подготавливаем данные:
        long[] myArray = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        // вызываем целевой метод:
        long actual = service.sumAllSales(myArray);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void CalcMediumSales() {
        StatsService service = new StatsService();

        // подготавливаем данные:
        long[] myArray = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;

        // вызываем целевой метод:
        long actual = service.mediumSales(myArray);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void CalcMaxSales() {
        StatsService service = new StatsService();

        // подготавливаем данные:
        long[] myArray = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;

        // вызываем целевой метод:
        long actual = service.maxSales(myArray);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void CalcMinSales() {
        StatsService service = new StatsService();

        // подготавливаем данные:
        long[] myArray = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;

        // вызываем целевой метод:
        long actual = service.minSales(myArray);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void CalcNumberOfMonthLessThanMedium() {
        StatsService service = new StatsService();

        // подготавливаем данные:
        long[] myArray = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        // вызываем целевой метод:
        long actual = service.monthLessThanMedium(myArray);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void CalcNumberOfMonthMoreThanMedium() {
        StatsService service = new StatsService();

        // подготавливаем данные:
        long[] myArray = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        // вызываем целевой метод:
        long actual = service.monthMoreThanMedium(myArray);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }
}
