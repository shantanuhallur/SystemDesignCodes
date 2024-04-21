class Test {
    public static void main(String[] args) {
        CarRentServices hyundaiCarRent = new HyundaiService();
        System.out.println(hyundaiCarRent.carRent(10));
        
        CarRentServices marutiCarRent = new MarutiService();
        System.out.println(marutiCarRent.carRent(10));
    }
}