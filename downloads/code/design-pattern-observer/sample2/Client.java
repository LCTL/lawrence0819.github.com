import java.util.Date;

public class Client implements Observer {

    @Override
    public void notify(String message) {
        System.out.println(String.format(
                "Client %s display message: %s at time: %s",
                Integer.toHexString(this.hashCode()), message, new Date()));
    }

}
