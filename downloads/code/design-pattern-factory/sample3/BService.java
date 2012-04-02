public class BService {

    private Logger logger;
    
    public BService(LoggerFactory loggerFactory){
        logger = loggerFactory.createLogger(this.getClass());
    }
    
    public void doSomething(){
        logger.info("doSomething start");
        
        // code...
        
        logger.info("doSomething end");
    }
    
}
