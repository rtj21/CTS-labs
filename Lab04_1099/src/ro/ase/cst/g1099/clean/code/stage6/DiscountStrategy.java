package ro.ase.cst.g1099.clean.code.stage6;

import ro.ase.cst.g1099.clean.code.stage6.exceptions.MissingMarketingStrategyException;

//stage 6
// single responsibility at class level
//outsource smth
public class DiscountStrategy {

    MarketingStrategy marketingStrategy;

    public float getDiscountValue(ProductType productType, float productPrice) {
        return productType.getDiscount() * productPrice;
    }

    public float getPriceWithDiscount(ProductType productType, float productPrice) {
        return productPrice - this.getDiscountValue(productType, productPrice);
    }


    public float getFinalPrice(ProductType productType, float productPrice, int accountAgeInYears) {

        if(this.marketingStrategy==null){
            throw new MissingMarketingStrategyException();
        }

        float accountDiscount = (productType != ProductType.NEW) ? marketingStrategy.getAccountDiscount(accountAgeInYears) : 0;

        if (productType == ProductType.NEW) {
            accountDiscount = marketingStrategy.getAccountDiscount(accountAgeInYears);
        }

        float finalPrice = this.getPriceWithDiscount(productType, productPrice) * (1 - accountDiscount);


        return finalPrice;
    }
}