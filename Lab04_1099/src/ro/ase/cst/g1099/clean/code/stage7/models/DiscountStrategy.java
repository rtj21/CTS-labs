package ro.ase.cst.g1099.clean.code.stage7.models;

import ro.ase.cst.g1099.clean.code.stage6.exceptions.MissingMarketingStrategyException;
import ro.ase.cst.g1099.clean.code.stage7.interfaces.MarketingStrategyInterface;
import ro.ase.cst.g1099.clean.code.stage7.models.marketing.MarketingStrategy;

//stage 7
// DIP - dependency inversionprinciple
// remove the dependency on the Marketing Strategy class
public class DiscountStrategy {

    //dip
    MarketingStrategyInterface marketingStrategy;

    //dependecy injection by constructor
    public DiscountStrategy(MarketingStrategyInterface marketingStrategy) {
        super();
        if(this.marketingStrategy == null)
            throw new MissingMarketingStrategyException();
        this.marketingStrategy = marketingStrategy;
    }

    public DiscountStrategy() {
    }

    //dependency injection by setter
    public void setMarketingStrategy(MarketingStrategyInterface marketingStrategy) {
        this.marketingStrategy = marketingStrategy;
    }

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