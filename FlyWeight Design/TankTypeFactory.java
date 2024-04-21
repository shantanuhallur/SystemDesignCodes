import java.util.HashMap;

public class TankTypeFactory {

    static HashMap<String,TankType> repo = new HashMap<>();

    public static TankType getTankType(String type) {
        TankType res = null;
        if(repo.containsKey(type)){
            res = repo.get(type);
        }
        else{
            switch (type) {
                case "typeA":
                    res = new TankType("typeA",10,20,null);
                    break;

                case "typeB":
                    res = new TankType("typeB",40,80,null);    
                    break;
        
                case "typeC":
                    res = new TankType("typeC",700,120,null);
                    break;

                default:
                    break;
            }
            repo.put(type, res);
        }
    
        return res;
    }
}
