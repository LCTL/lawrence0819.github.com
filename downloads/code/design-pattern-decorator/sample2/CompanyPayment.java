public class CompanyPayment extends AdditionalPayment {

    private final double serviceFee;
    
    public CompanyPayment(Payment payment, double serviceFee) {
        
        super(payment);
        this.serviceFee = 1 + serviceFee;
        
    }

    @Override
    public double charge(User user, int minute) {
        
        if (user.isCompany()){
            return payment.charge(user, minute) * serviceFee;
        }
        
        return payment.charge(user, minute);
        
    }

}
