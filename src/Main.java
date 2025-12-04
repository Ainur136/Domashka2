public class Main {
    public static void main(String[] args) {
        int ticket = 17350;// Цена билета
        int bonus = 20; // коэффициент
        int miles = 0; // количество мили

        int x;
        int result;
        if (ticket >0) {
            result = ticket / bonus;
            System.out.println("Начислено миль: " + result);
        } else {
            x = bonus * miles;
            System.out.println("На сумму: " + x +"руб. Получите: "+ miles + " Миль");
        }

    }
}
