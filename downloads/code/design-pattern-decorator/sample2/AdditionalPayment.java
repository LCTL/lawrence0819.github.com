public abstract class AdditionalPayment implements Payment {

    protected Payment payment;
    
    public AdditionalPayment(Payment payment){
        
        this.payment = payment;
        
    }
    
    public abstract double charge(User user, int minute);

}
