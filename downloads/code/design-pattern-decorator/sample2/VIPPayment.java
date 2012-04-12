public class VIPPayment extends AdditionalPayment {

    private final double discount;
    
    public VIPPayment(Payment payment, double discount) {
        
        super(payment);
        this.discount = discount;
        
    }

    @Override
    public double charge(User user, int minute) {
        
        if (user.isVip()){
            return payment.charge(user, minute) * discount;
        }
        
        return payment.charge(user, minute);
        
    }

}
