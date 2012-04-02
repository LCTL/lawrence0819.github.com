public class MockLoggerFactory extends LoggerFactory {

    @Override
    public Logger createLogger(Class<?> clazz) {
        return new ConsoleLogger(clazz);
    }

    
}
