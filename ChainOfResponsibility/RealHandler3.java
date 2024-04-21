public class RealHandler3 extends Handler{

    public RealHandler3(Handler next) {
        super(next);
    }

    @Override
    void handleRequest(Request obj) {
        if(obj.state < 0) {
            System.out.println("Handling the negative state request");
        } else if(next != null){
            System.out.println("Cannot handle the request hence deligating");
            next.handleRequest(obj);
        }
        
    }
    
}
