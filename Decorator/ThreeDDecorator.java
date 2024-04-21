public class ThreeDDecorator extends ShapeDecorator  {

    ThreeDDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        System.out.println("Making the shape 3D");
        super.draw();
    }
}
