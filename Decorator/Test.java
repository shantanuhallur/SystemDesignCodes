public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle();
        borderDecorator addBorder = new borderDecorator(circle);
        fillDecorator fillShape = new fillDecorator(addBorder);
        ThreeDDecorator threeD = new ThreeDDecorator(fillShape);
        threeD.draw();
    }
}