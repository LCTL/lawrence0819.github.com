public class MobilePayment {

    final double moneyPerMinute;
    
    public MobilePayment(double moneyPerMinute){
        
        this.moneyPerMinute = moneyPerMinute;
        
    }
    
    public double charge(User user, int minute) {

        double fee = minute * moneyPerMinute;

        if (minute >= 10000) {
            fee *= 0.8;
        } else if (minute >= 7000) {
            fee *= 0.85;
        } else if (minute >= 4000) {
            fee *= 0.9;
        } else if (minute >= 2000) {
            fee *= 0.95;
        }

        if (user.isVip()) {
            fee *= 0.9;
        }

        return fee;

    }

}
