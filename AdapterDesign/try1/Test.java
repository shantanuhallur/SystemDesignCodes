class Test {
    public static void main(String[] args) {
        Employees employee = new Employees();
        EmployeeToPL employeeToPl = new EmployeeToPL(employee);
        Intranet intranet = new Intranet(employeeToPl);
        intranet.printNos();
    }
}