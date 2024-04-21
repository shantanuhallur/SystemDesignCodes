//cannot make this classe's object as its abstract
public abstract class Handler {
    protected Handler next;

    public Handler(Handler next) {
        this.next = next;
    }

    abstract void handleRequest(Request obj);
}
