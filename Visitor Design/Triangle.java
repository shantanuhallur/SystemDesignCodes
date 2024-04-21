public class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("-----------------------------------");
        System.out.println("Draw a Triangle");
    }

    @Override
    void visit(Visitor visitor) {
        visitor.visit(this);
    }
}
