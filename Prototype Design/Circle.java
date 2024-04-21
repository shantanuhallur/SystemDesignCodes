public class Circle implements Shape {
    int x;
    int rad;

    public Circle() {
        //makes hit to db to set x and rad.
    }
    
    private Circle(int x, int rad) {
        this.x = x;
        this.rad = rad;
    }

    @Override
    public Shape cloneShape() {
        // Makes deep copy of current object and returns a new cloned object to the reference.
        return new Circle(this.x,this.rad);
    }
}
