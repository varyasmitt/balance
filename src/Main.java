public class Main {
    public static void main(String[] args) {
        int balance = 200;
        int replenishment = 1100;
        int bonus = replenishment / 100;
        boolean summ = replenishment > 1000;
        int finalBalance = summ ? balance + replenishment + bonus : balance + replenishment;
        if (replenishment > 1000) {
            System.out.println(" Баланс " + finalBalance + " Бонус " + bonus);
        } else {
            System.out.println(" Баланс " + finalBalance + " Бонус 0");
        }
    }
}
