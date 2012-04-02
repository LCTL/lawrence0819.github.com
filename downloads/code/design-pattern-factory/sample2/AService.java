public class AService {

    private final Logger logger = LoggerFactory.createLogger(this.getClass());
    
    public void doSomething(){
        logger.info("doSomething start");
        
        // code...
        
        logger.info("doSomething end");
    }
    
}
