public class Main {

    public static void main(String[] args) {

        // $1.2 per minute
        Payment mobilePayment = new BasicMobilePayment(1.2);
        Payment usageAmountPayment = new UsageAmountPayment(mobilePayment);
        Payment vipPayment = new VIPPayment(usageAmountPayment, 0.9);
        Payment companyPayment = new CompanyPayment(vipPayment, 0.1);
        
        Payment payment = companyPayment;

        User user1 = new User("Lawrence", true, false);
        User user2 = new User("Tony", false, false);
        
        User user3 = new User("ABC Company", false, true);

        System.out.println(user1.getName() + " usage: 10000 minute, charge: "
                + payment.charge(user1, 10000));
        System.out.println(user2.getName() + " usage: 4000 minute, charge: "
                + payment.charge(user2, 4000));
        System.out.println(user3.getName() + " usage: 10000 minute, charge: "
                + payment.charge(user3, 10000));

    }

}
