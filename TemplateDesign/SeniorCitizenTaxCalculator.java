public class SeniorCitizenTaxCalculator extends TaxCalculator {
    @Override
    int applyStandardDecuction(int income) {
        return income - 100000;
    }

    @Override
    int applySurcharge(int tax) {
        return (int)(tax*1.0);
    }

    @Override
    int applyTaxRate(int income) {
        return (int)(income*0.1);
    }
}
