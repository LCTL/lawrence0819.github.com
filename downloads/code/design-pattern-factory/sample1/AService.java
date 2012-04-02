public class AService {

    private final Logger logger = new ConsoleLogger(this.getClass());
    
    public void doSomething(){
        logger.info("doSomething start");
        
        // code...
        
        logger.info("doSomething end");
    }
    
}
