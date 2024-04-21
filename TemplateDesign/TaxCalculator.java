public abstract class TaxCalculator {
    public final int calculateTax(int income) { //final as all taxes are calculated in the same way.
        int incAfterSD = applyStandardDecuction(income);
        int tax = applyTaxRate(incAfterSD);
        int taxAfterSurcharge = applySurcharge(tax);
        return taxAfterSurcharge;
    }

    abstract int applyStandardDecuction(int income);
    abstract int applyTaxRate(int income);
    abstract int applySurcharge(int tax);
}
