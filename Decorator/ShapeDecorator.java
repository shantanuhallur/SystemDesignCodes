public class ShapeDecorator extends Shape {
    Shape nextShape;
    ShapeDecorator(Shape nextShape) {
        this.nextShape = nextShape;
    }

    @Override
    public void draw() {
        nextShape.draw();
    }
}
