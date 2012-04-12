public class Main {

    public static void main(String[] args) {

        // $1.2 per minute
        MobilePayment mobilePayment = new MobilePayment(1.2);

        User user1 = new User("Lawrence", true);
        User user2 = new User("Tony", false);

        System.out.println(user1.getName() + " usage: 10000 minute, charge: "
                + mobilePayment.charge(user1, 10000));
        System.out.println(user2.getName() + " usage: 4000 minute, charge: "
                + mobilePayment.charge(user2, 4000));

    }

}
