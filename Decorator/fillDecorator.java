public class fillDecorator extends ShapeDecorator {

    fillDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        System.out.println("Filling the shape ...");
        super.draw();
    }
    
}
