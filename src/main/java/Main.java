public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        long amount = 100_060;
        boolean registered = true;

        long bonus = service.calculate(amount, registered);
        System.out.println("Размер бонуса:" + bonus);

    }
}

