public class LoggerFactory {

    public Logger createLogger(Class<?> clazz){
        return new FileLogger(clazz);
    }
    
}
