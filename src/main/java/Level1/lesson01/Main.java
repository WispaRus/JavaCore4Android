package Level1.lesson01;

public class Main {
    //region Задача 1
    public static void main(String[] args) {
    //region Задача 2
        byte byteVar = -120;
        short shortVar = 12442;
        int intVar = 1000;
        long longVar = 200000L;
        float floatVar = 12.23f;
        double doubleVar = -123.123;
        char charVar = '*';
                boolean booleanVar = false;
    //endregion
        System.out.println(calculate(2, 2, 2, 2));
        System.out.println(task10and20(5,6));
        isPositiveOrNegative(-30);
        isNegative(1);
    }  //endregion
    //region Задача 3

    public static float calculate(int a, int b, int c, int d) {
      float result = a * (b + (c / d));
      return result;

    }


    //endregion
    //region Задача 4
    /*
    Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно),
    если да – вернуть true, в противном случае – false.
     */
    public static boolean task10and20(int x1, int x2) {
        if ((x1 + x2) >= 10 && (x1 + x2) <= 20) {
            return true;
        } else return false;
    }




    //endregion
    //region Задача 5

    public static void isPositiveOrNegative(int x) {
        if(x > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }


    //endregion
    //region Задача 6

    public static boolean isNegative(int x3) {
        if(x3 > 0) {
            return false;
        }
            return true;
    }


    //endregion
}
