import java.util.ArrayList;
import java.util.List;

public class EmpDetailsToCompanyAdapter implements Company {
    //IMPLETMENTATION OF INTERFACE WITH SOURCE IN INJECTION.
    //ADAPTER CONTAINS SOURCE
    EmployeeDetails empDetails;

    public EmpDetailsToCompanyAdapter(EmployeeDetails empDetails) {
        this.empDetails = empDetails;
    }
    @Override
    public List<String> getCompany() {
        // TODO Auto-generated method stub
        List<String> Companies = new ArrayList<>();
        List<String> details = empDetails.getDetails();
        for(String detail : details) {
            String[] seperations = detail.split("-");
            Companies.add(seperations[2]);
        }

        return Companies;
    }
}
