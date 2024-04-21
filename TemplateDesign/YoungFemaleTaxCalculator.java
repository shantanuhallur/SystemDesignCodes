public class YoungFemaleTaxCalculator extends TaxCalculator {
    @Override
    int applyStandardDecuction(int income) {
        return income - 30000;
    }

    @Override
    int applySurcharge(int tax) {
        return (int)(tax * 1.01);
    }

    @Override
    int applyTaxRate(int income) {
        return (int)(income * 0.2);
    }
}
