public class UsageAmountPayment extends AdditionalPayment {

    public UsageAmountPayment(Payment payment) {
        super(payment);
    }

    @Override
    public double charge(User user, int minute) {
        
        if (minute >= 10000) {
            return payment.charge(user, minute) * 0.8;
        } else if (minute >= 7000) {
            return payment.charge(user, minute) * 0.85;
        } else if (minute >= 4000) {
            return payment.charge(user, minute) * 0.9;
        } else if (minute >= 2000) {
            return payment.charge(user, minute) * 0.95;
        }
        
        return payment.charge(user, minute);
        
    }

}
