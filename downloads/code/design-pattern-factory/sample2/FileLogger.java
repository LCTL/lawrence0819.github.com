import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;


public class FileLogger implements Logger {

    private Class<?> clazz;
    
    public FileLogger(Class<?> clazz){
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
        String log = new Date().toString() + " " + clazz.getSimpleName() + " [" + level + "] " + message + "\n";
        
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("application.log", true));  
            bw.append(log);
            bw.flush();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                bw.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }

}
