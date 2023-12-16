public class Ex1 {
    /* Представим, что у нас есть устройство, в котором две колбы.
       Прибор работает корректно, если температура первой колбы выше 100 градусов, а температура второй колбы
       меньше 100 градусов.
       Вы должны написать метод, который проверяет это устройство.
       Ваша программа должна иметь переменные temperature1 и temperature2.
       В результате метод возвращает true или false.
       */

    public static void main(String[] args) {
        int temperature1 = 101;
        int temperature2 = 50;

        System.out.println(device(temperature1, temperature2));
    }

    private static boolean device(int temperature1, int temperature2) {
        return temperature1 > 100 && temperature2 < 100;
    }
}