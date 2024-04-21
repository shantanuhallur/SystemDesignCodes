import java.util.ArrayList;

public class FDTCAdapter implements ICompanies {
    //ADAPTER HAS SOURCE OBJECT INSIDE IT. :- COMPOSITION 
    SourceClass empDetails;

    FDTCAdapter(SourceClass empDetails) {
        this.empDetails = empDetails;
    }

    @Override
    public ArrayList<String> getCompanies() {
        // TODO Auto-generated method stub
        ArrayList<String> details = empDetails.getEmployeeDetails();
        ArrayList<String> Companies = new ArrayList<>();
        for(String detail: details ) {
            String[] seperatedDetail = detail.split("-");
            Companies.add(seperatedDetail[0]);
        }
        return Companies;
    }
}
