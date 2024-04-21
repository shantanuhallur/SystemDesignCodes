import java.util.ArrayList;

public class ConsumerClass {
    ICompanies adapterObject;

    ConsumerClass(ICompanies adapterObject) {
        this.adapterObject = adapterObject;
    }

    public ArrayList<String> printCompanies() {
        ArrayList<String> companies = adapterObject.getCompanies();
        return companies;
    }

}
