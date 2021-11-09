package ru.geekbrains.lesson1;

/**
 * Главный класс моего приложения
 */
public class Sample01 {

    /**
     * Главный метод - точка входа в программу
     * @param args - аргументы приложения
     */
    public static void main(String[] args) { // psvm

        //region Вывод информации

        // Вывод информации на экран
        System.out.println("Hello, World!"); // sout
        System.out.println("Hello, GeekBrains! (1)");
        System.out.println("Hello, GeekBrains! (1)");
        /*
            Многострочный
            комментарий
        */
        System.out.println("Hello, GeekBrains! (2)");

        //endregion

        //region Задача 1

        int count;
        count = 12;
        short index = 1;
        long count02 = 20000000000L;

        double sum01 = 12.25;
        float sum02 = 12.25f;

        final boolean flag = false;
        //flag = true;

        int a = 2;
        int b = 6;
        int c = 5;

        // + - * / %

        int p = a + b + c;
        System.out.println("Периметр треугольника ABC равен " + p);
        System.out.println("Периметр треугольника ABC, где a = " + a + " b = " + b + " c = " + c + " равен " + p);
        System.out.printf("Периметр треугольника ABC, где a = %d b = %d c = %d равен %d\n", a, b, c, p); // souf



        //endregion

        //region Задача 2

        // if (условие)
        // {
        //  инструкции ...
        // }

        // < <= > >= == !=

        double height = 1.78; // метры
        double weight = 55; // кг

        System.out.println("Ваш рост (м): " + height);
        System.out.println("Ваш вес (кг): " + weight);

        double imt = weight / (height * height);
        //System.out.println("ИМТ: " + imt);
        System.out.printf("ИМТ: %.2f\n", imt);

        if (imt <= 16){
            System.out.println("У вас выраженный дефицит массы тела.");
        }
        else if (imt > 16 && imt <= 18.5){
            System.out.println("У вас недостаточная масса тела (дефицит).");
        }
        else if (imt > 18.5 && imt <= 28){ // && - логическое И, || - логическое ИЛИ
            System.out.println("У вас нормальное телосложение");
        }
        else{
            System.out.println("У вас избыточная масса тела");
        }



        //endregion

        //region Задача 3

        a = 0;
        b = 0;
        c = 0;


        //endregion

    }

}
