class Test {
    public static void main(String[] args) {
        TaxCalculator tc1 = new YoungMaleTaxCalculator();
        TaxCalculator tc2 = new YoungFemaleTaxCalculator();
        TaxCalculator tc3 = new SeniorCitizenTaxCalculator();
        System.out.println("Young Male: " + tc1.calculateTax(1000000));
        System.out.println("Young Female: " + tc2.calculateTax(1000000));
        System.out.println("Senior Citizen: " + tc3.calculateTax(1000000));
    }
}