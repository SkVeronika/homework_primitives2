public class Main {
    public static void main(String[] args) {
        int InitialBalance = 100;
        int AmountDeposit = 1100;
        int bonus;

        if (AmountDeposit > 1000) {
            bonus = AmountDeposit / 100;
        } else {
            bonus = 0;
        }
        System.out.println("Счет клиента " + (InitialBalance + AmountDeposit + bonus) + " рублей");
    }
}