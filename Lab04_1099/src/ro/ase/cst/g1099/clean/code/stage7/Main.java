package ro.ase.cst.g1099.clean.code.stage7;

import ro.ase.cst.g1099.clean.code.stage7.models.DiscountStrategy;
import ro.ase.cst.g1099.clean.code.stage7.models.ProductType;
import ro.ase.cst.g1099.clean.code.stage7.models.marketing.MarketingStrategy;
import ro.ase.cst.g1099.clean.code.stage7.models.marketing.SummerMarketingStrategy;

public class Main {
    public static void main(String[] args) {
        //test DIP

        DiscountStrategy discountStrategy = new DiscountStrategy();
        discountStrategy.setMarketingStrategy(new SummerMarketingStrategy());
        float finalPrice = discountStrategy.getFinalPrice(ProductType.NEW,1000,10);
        System.out.println("Final price: "+ finalPrice);
    }
}
