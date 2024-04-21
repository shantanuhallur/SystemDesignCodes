import java.util.List;

public class Intranet {
    PhoneListSource source;

    Intranet(PhoneListSource source){
        this.source = source;
    }

    public void printPhoneNumbers(){
        List<String> numbers = source.getPhoneNumbers();
        System.out.println(numbers);
    }
    
}
