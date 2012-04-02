public class AService {

    private Logger logger;
    
    public AService(LoggerFactory loggerFactory){
        logger = loggerFactory.createLogger(this.getClass());
    }
    
    public void doSomething(){
        logger.info("doSomething start");
        
        // code...
        
        logger.info("doSomething end");
    }
    
}
