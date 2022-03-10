package ro.ase.cts.g1099.cleancode.stage1;

public class DiscountStrategy {

    public static final int  PREMIUM_ACCOUNT_MIN_AGE = 10;
    public static final float PREMIUM_DISCOUNT=0.15f;
    public static final int NEW_PRODUCT_TYPE = 1;
    public static final int NORMAL_PRODUCT_TYPE = 2;
    public static final int ON_SALE_PRODUCT_TYPE = 3;
    public static final int ON_FINAL_SALE_PRODUCT_TYPE = 4;

    public static final float NEW_PRODUCT_DISCOUNT =0.0f;
    public static final float NORMAL_PRODUCT_DISCOUNT =0.1f;
    public static final float ON_SALE_PRODUCT_DISCOUNT =0.25f;
    public static final float ON_FINAL_SALE_PRODUCT_DISCOUNT =0.35f;
    public float Calculeaza(int productType, float productPrice, int accountAgeInYears)
    {
        float finalPrice = 0;
        float accountDiscount = (accountAgeInYears > 10) ? (float)15/100 : (float)accountAgeInYears/100;
        if (productType == 1)
        {
            finalPrice = productPrice;
        }
        else if (productType == 2)
        {
            finalPrice = (productPrice - (0.1f * productPrice)) - accountDiscount * (productPrice - (0.1f * productPrice));
        }
        else if (productType == 3)
        {
            finalPrice = (productPrice - (0.25f * productPrice)) - accountDiscount * (productPrice - (0.25f * productPrice));
        }
        else if (productType == 4)
        {
            finalPrice = (productPrice - (0.35f * productPrice)) - accountDiscount * (productPrice - (0.35f * productPrice));
        }
        return finalPrice;
    }
}
