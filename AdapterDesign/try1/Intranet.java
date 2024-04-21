import java.util.ArrayList;
import java.util.List;

public class Intranet {
    PhoneListSource source;

    Intranet(PhoneListSource source) {
        this.source = source;
    }

    public void printNos() {
        List<String> realNos = source.getPhoneNos();
        System.out.println(realNos);
    }
}
