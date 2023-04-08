public class CreditPaymentService {

    public int calculate(int creditAmount, double creditRateYear, int creditPeriodYear) {
        double creditRateMonth = creditRateYear / 12 / 100;
        double coefficientAnnuity = creditRateMonth *  (Math.pow ((1 + creditRateMonth), creditPeriodYear * 12)) / ((Math.pow ((1 + creditRateMonth), creditPeriodYear * 12)) - 1);
        double annuityPayment = creditAmount * coefficientAnnuity;
        return (int) annuityPayment;
    }
}
