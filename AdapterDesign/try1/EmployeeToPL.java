import java.util.*;
public class EmployeeToPL implements PhoneListSource {
    Employees obj;
    EmployeeToPL(Employees obj) {
        this.obj = obj;
    }
    //return converted list of PL
    public List<String> getPhoneNos() {
        List<String> nos = new ArrayList<>();
        List<String> details = obj.getEmployees();
        for(String detail: details) {
            String[] noName =detail.split("-");
            nos.add(noName[0]);
        }
        return nos;
    }
}
