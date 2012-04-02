import java.util.Date;

public class ConsoleLogger implements Logger {

    private Class<?> clazz;
    
    public ConsoleLogger(Class<?> clazz){
        this.clazz = clazz;
    }
    
    @Override
    public void debug(String message) {
        log("DEBUG", message);
    }

    @Override
    public void info(String message) {
        log("INFO", message);
    }

    @Override
    public void warn(String message) {
        log("WARN", message);
    }

    @Override
    public void error(String message) {
        log("ERROR", message);
    }

    protected void log(String level, String message) {
        System.out.println(new Date().toString() + " " + clazz.getSimpleName() + " [" + level + "] " + message);
    }

}
