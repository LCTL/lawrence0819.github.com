public class LoggerFactory {

    public static Logger createLogger(Class<?> clazz){
        return new FileLogger(clazz);
    }
    
}
