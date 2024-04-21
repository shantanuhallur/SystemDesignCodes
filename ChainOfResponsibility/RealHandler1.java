public class RealHandler1 extends Handler {

    public RealHandler1(Handler next) {
        super(next); //as it derives from handle we can directly
                    //inititalize next to super's next; || Calls parent's constructor and passes next. 
    }

    @Override
    void handleRequest(Request obj) {
        if(obj.state > 0) {
            System.out.println("Handling the positive state request");
        } else if(next != null){
            System.out.println("Cannot handle the request hence deligating");
            next.handleRequest(obj);
        }
        
    }
    
}
