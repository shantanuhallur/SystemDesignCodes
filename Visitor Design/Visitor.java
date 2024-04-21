public abstract class Visitor {
    abstract void visit(Circle circle);
    abstract void visit(Triangle triangle );
    abstract void visit(Rectangle rectangle);
}
