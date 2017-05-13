package com.company.mediator;

/**
 * Created by kajornsak on 4/1/2017 AD.
 */
public interface IMediator {
    public void registerAmericanSeller(AmericanSeller seller);
    public void registerFrenchBuyer(Buyer buyer);
    public void registerSwedishBuyer(Buyer buyer);
    public boolean placeBid(float bit,String unitOfCurrency);
    public void registerDollarConverter(DollarConverter dollarConverter);
}
