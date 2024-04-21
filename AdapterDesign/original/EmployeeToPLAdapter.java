import java.util.ArrayList;
import java.util.List;

public class EmployeeToPLAdapter implements PhoneListSource {
    EmplyeeDetails empdetails;

    public EmployeeToPLAdapter(EmplyeeDetails empdetails) {
        this.empdetails = empdetails;
    }

    @Override
    public List<String> getPhoneNumbers() {
        // TODO Auto-generated method stub
        List<String> details = empdetails.getEmployees();
        List<String> phoneNos = new ArrayList<>();

        for(String detail:details){
            String[] parts = detail.split("-");
            phoneNos.add(parts[3]);
        }

        return phoneNos;
    }
    
}
