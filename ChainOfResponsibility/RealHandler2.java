public class RealHandler2 extends Handler {

    RealHandler2(Handler next) {
        super(next);
    }
    @Override
    void handleRequest(Request obj) {
        if(obj.state == 0) {
            System.out.println("Handling the zero state request");
        } else if(next != null){
            System.out.println("Cannot handle the request hence deligating");
            next.handleRequest(obj);
        }
    }
    
}
