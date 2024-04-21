public class borderDecorator extends ShapeDecorator {

    borderDecorator(Shape nextshape) {
        super(nextshape);
    }

    @Override
    public void draw() {
        System.out.println("Adding a border to the shape....");
        super.draw(); //here ShapeDeco.draw where nextshape.draw is called
    }
    
}
