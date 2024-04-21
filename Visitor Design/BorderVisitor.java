public class BorderVisitor extends Visitor {
    @Override
    void visit(Circle circle) {
        System.out.println("Drawing a border to circle");
    }

    @Override
    void visit(Triangle triangle) {
        System.out.println("Drawing a border to triangle");
    }

    @Override
    void visit(Rectangle rectangle) {
        System.out.println("Drawing a border to rectangle");
    }
}
