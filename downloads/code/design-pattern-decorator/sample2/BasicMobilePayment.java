public class BasicMobilePayment implements Payment {

    final double moneyPerMinute;
    
    public BasicMobilePayment(double moneyPerMinute){
        
        this.moneyPerMinute = moneyPerMinute;
        
    }
    
    public double charge(User user, int minute) {

        return minute * moneyPerMinute;

    }

}
