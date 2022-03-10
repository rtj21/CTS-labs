package ro.ase.cts.g1099.cleancode.stage2;

public enum ProductType {
    NEW(1, 0), DISCOUNT(2, 0.15f), SALES(3, 0.25f), FINAL_SALES(3, 0.35f);

    int id;
    float discountValue;

    // only private constructors in enums
    private ProductType(int id, float discountValue) {
        this.id = id;
        this.discountValue = discountValue;
    }

    float getDiscount() {
        return this.discountValue;
    }
}
