import java.util.HashMap;

public class CacheProxyWork implements ISomeWork {
    RealWork rw = new RealWork();
    HashMap<Integer,Integer> f1map = new HashMap<>();

    @Override
    public int fun1(int x) {
        if(f1map.containsKey(x) == true){
            System.out.println("Getting the already stored Data from Cache");
            f1map.get(x); //alse can return timestamp with this.
        }

        int res = rw.fun1(x);
        f1map.put(x,res);
        return res;    
    }

}
