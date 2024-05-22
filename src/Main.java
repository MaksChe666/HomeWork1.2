public class Main {
    public static void main(String[] args) {
        int balance = 100; // начальный баланс
        int total = 1100; // сумма пополнения

        int bonus = 0;
        if (total > 0) {
            if (total > 1000) {
                bonus = total / 100;
            }
            balance = balance + bonus + total;
            System.out.println(balance + bonus);
        }
    }
}