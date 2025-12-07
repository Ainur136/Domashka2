public class Main {
    public static void main(String[] args) {
        int ticket = 28350;// Цена билета
        int bonus = 20; // коэффициент
        int miles = 0; // количество мили

        int sum;
        int result;
        if (ticket > 0) {
            result = ticket / bonus;
            System.out.println("Начислено миль: " + result);
        } else {
            sum = bonus * miles;
            System.out.println("На сумму: " + sum + "руб. Получите: " + miles + " Миль");
        }

    }
}