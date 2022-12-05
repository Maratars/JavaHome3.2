public class Main {
    public static void main(String[] args) {
        int balance = 100; //рублей
        int add = 1355; //рублей
        int bonus = add / 100;
        int newBalance;

        if (add >= 1000) {
            newBalance = balance + add + bonus;
        } else {
            newBalance = balance + add;
        }

        System.out.println("Итого баланс с бонусами: " + newBalance + " руб");
    }
}