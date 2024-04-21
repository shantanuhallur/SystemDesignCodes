public class HyundaiService extends CarRentServices {
    @Override
    ICar getCar() {
        return new HyundaiCar();
    }
}
