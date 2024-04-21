public class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("-----------------------------------");
        System.out.println("Draw a Circle");
    }

    @Override
    void visit(Visitor visitor) {
        visitor.visit(this);
    }
}
