package ru.netology.stats;

public class StatsService {
    public int sumCalculete(long[] sales) {
        int sum = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            sum += sale;


        }
        return sum;
    }

    public int averageSales(long[] sales) {
        return sumCalculete(sales) / sales.length; // Вызываем метод расчета общей суммы и делим на колличество месяцев
    }


    public int minSales(long[] sales) {  // Минимальное количество продаж в месяце
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {   //Максимальное колличество продаж в месяце
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int belowAverage(long[] sales) {
        long month = 0;   // переменная колличества месяцев
        for (long sale : sales) {

            if (sale < averageSales(sales)) {  // рассматриваемый месяц сравниваем с средним месяцем из метода по вычислению средней суммы
                month = month + 1;
            }
        }
        return (int) month;
    }

    public int aboveAverage(long[] sales) {
        long month = 0;               // идентично мотоду belowAverage
        for (long sale : sales) {

            if (sale > averageSales(sales)) {
                month = month + 1;
            }
        }
        return (int) month;
    }


}
