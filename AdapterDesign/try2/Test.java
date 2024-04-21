class Test {
    public static void main(String[] args) {
        EmployeeDetails employees = new EmployeeDetails();
        EmpDetailsToCompanyAdapter adapter = new EmpDetailsToCompanyAdapter(employees);
        EmployeeCompanies companies = new EmployeeCompanies(adapter);
        System.out.println( companies.printCompany());
    }
}