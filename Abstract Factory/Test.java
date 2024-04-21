class Test {
    public static void main(String[] args) {
        CarRentServices hyundaiCarRent = new CarRentServices();
        HyundaiCarFactory hyundaiCar = new HyundaiCarFactory();
        System.out.println(hyundaiCarRent.carRent(10,hyundaiCar));
        
        CarRentServices marutiCarRent = new CarRentServices();
        HyundaiCarFactory marutiCar = new HyundaiCarFactory();
        System.out.println(marutiCarRent.carRent(10,marutiCar));
    }
}