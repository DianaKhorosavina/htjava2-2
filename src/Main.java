public class Main {
    public static void main(String[] args) {
        int account = 300;
        int money = 1100;
        int bonus;
        int balance;


        if (money > 1000) {
            bonus = money / 100;
            balance = account + money + bonus;

        } else {
            bonus = 0;
            balance = account + money;

        }
        System.out.println("Сумма пополнения счета: " + money + " Бонусов начислено: " + bonus + " Баланс: " + balance
        );

    }
}
