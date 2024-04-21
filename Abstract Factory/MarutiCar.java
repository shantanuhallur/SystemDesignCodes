public class MarutiCar implements ICar {
    @Override
    public void start() {
        System.out.println("Maruti Car starts logic");
    }

    @Override
    public void stop() {
        System.out.println("Maruti Car stops logic");
    }

    @Override
    public int pricePerKm() {
        return 12;
    }
}
