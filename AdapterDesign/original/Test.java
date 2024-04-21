public class Test {
    public static void main(String[] args) {
        EmplyeeDetails dataSource = new EmplyeeDetails();
        EmployeeToPLAdapter adapter = new EmployeeToPLAdapter(dataSource); //Adapter needs datasource for conversion
        Intranet intra = new Intranet(adapter); //we can pass Class object which implements 
        intra.printPhoneNumbers();              // Interface PhoneListSource to Intranet.        
    }
}
