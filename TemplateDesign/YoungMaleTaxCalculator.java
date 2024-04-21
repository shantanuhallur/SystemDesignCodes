public class YoungMaleTaxCalculator extends TaxCalculator {
    @Override
    int applyStandardDecuction(int income) {
        return income - 50000;
    }

    @Override
    int applySurcharge(int tax) {
        return (int)(tax * 1.02);
    }

    @Override
    int applyTaxRate(int income) {
        return (int)(income * 0.2);
    }
}
