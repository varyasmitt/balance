public class Main {
    public static void main(String[] args) {
        int balance = 200;
        int replenishment = 1000;
        int bonus;
        if (replenishment > 1000) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }
        int finalBalance = balance + replenishment + bonus;
        System.out.println(" Баланс " + finalBalance + " Бонус " + bonus);
    }
}