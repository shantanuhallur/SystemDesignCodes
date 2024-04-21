import java.util.List;

public class EmployeeCompanies {
    //CONSUMER
    //CONSUMER CONTAINS INTERFACE'S IMPLEMENTATIONS OBJECT
    Company companies;

    EmployeeCompanies(Company companies) {
        this.companies = companies;
    }
    
    public List<String> printCompany() {
        // TODO Auto-generated method stub
        List<String> companyList = companies.getCompany(); 
        return companyList;
    }
}
