public class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("-----------------------------------");
        System.out.println("Draw a Rectangle");
    }

    @Override
    void visit(Visitor visitor) {
        visitor.visit(this);
    }
}
