public class MarutiService extends CarRentServices {
    @Override
    ICar getCar() {
        return new MarutiCar();
    }
}
