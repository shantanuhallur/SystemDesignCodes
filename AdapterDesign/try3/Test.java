public class Test {
    public static void main(String[] args) {
        SourceClass sourceClass = new SourceClass();
        FDTCAdapter adapter = new FDTCAdapter(sourceClass);
        ConsumerClass consumerClass = new ConsumerClass(adapter);
        System.out.println(consumerClass.printCompanies()); 
    }
}