public abstract class CarRentServices {
    int carRent(int kms) {
        System.out.println("-----------------");
        ICar car = getCar();
        car.start();
        car.stop();
        int bill = car.pricePerKm() * kms;
        return bill;
    }

    abstract ICar getCar();
    
}
