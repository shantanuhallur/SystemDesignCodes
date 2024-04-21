import java.util.ArrayList;
import java.util.List;

class Test {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();

        shapes.add(circle);
        shapes.add(triangle);
        shapes.add(rectangle);

        BorderVisitor borderVisitor = new BorderVisitor();
        DownloadPDFVisitor pdfVisitor = new DownloadPDFVisitor();

        for(Shape shape: shapes){
            shape.draw();
            shape.visit(borderVisitor);
            shape.visit(pdfVisitor);
        }
    }
}