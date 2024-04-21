public class DownloadPDFVisitor extends Visitor {
    @Override
    void visit(Circle circle) {
        System.out.println("Downloading Circle's PDF");
    }

    @Override
    void visit(Triangle triangle) {
        System.out.println("Downloading triangle's PDF");
    }

    @Override
    void visit(Rectangle rectangle) {
        System.out.println("Downloading Rectangle's PDF");
    }
}
