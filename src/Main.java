// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println();
        System.out.println(service.calculate(1_000_000, 9.99, 1) + " Ежемесячный платеж по ставке 9,99%");

        System.out.println();
        System.out.println(service.calculate(1_000_000, 9.99, 2) + " Ежемесячный платеж по ставке 9,99%");

        System.out.println();
        System.out.println(service.calculate(1_000_000, 9.99, 3) + " Ежемесячный платеж по ставке 9,99%");

        System.out.println();
        System.out.println(service.calculate(100_000, 9.99, 1) + " Ежемесячный платеж по ставке 9,99%");

        System.out.println();
        System.out.println(service.calculate(5_000_000, 8.85, 3) + " Ежемесячный платеж по ставке 8,85%");
        }
    }