public class CarRentServices {
    private ICarFactory cf;

    void setCarFactory(ICarFactory cf) {
        this.cf = cf;
    }
    int carRent(int kms, ICarFactory cf) {
        System.out.println("-----------------");
        ICar car = cf.getCar();
        car.start();
        car.stop();
        int bill = car.pricePerKm() * kms;
        return bill;
    }
}
