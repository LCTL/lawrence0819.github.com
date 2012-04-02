
public class Main {

    public static void main(String[] args) {
        LoggerFactory loggerFactory = new LoggerFactory();
        AService a = new AService(loggerFactory);
        BService b = new BService(loggerFactory);
        a.doSomething();
        b.doSomething();
        
        //Unit Test
        loggerFactory = new MockLoggerFactory();
        a = new AService(loggerFactory);
        b = new BService(loggerFactory);
        a.doSomething();
        b.doSomething();
    }

}
