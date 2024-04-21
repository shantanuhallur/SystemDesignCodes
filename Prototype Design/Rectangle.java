public class Rectangle implements Shape {
    int t1x;
    int t1y;
    int width;
    int height;

    public Rectangle() {
        //makes hit to db and sets its properties.
    }

    private Rectangle(int t1x, int t1y, int width, int height) {
        this.t1x = t1x;
        this.t1y = t1y;
        this.width = width;
        this.height = height;
    }
    
    @Override
    public Shape cloneShape() {
        // Makes deep copy of current object and returns a new cloned object to the reference.
        return new Rectangle(this.t1x,this.t1y,this.width,this.height);
    }
}
