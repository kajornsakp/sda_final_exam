package com.company.mediator;

/**
 * Created by kajornsak on 4/3/2017 AD.
 */
public class Mediator implements IMediator {
    private Buyer buyer;
    private AmericanSeller seller;
    private DollarConverter dollarConverter;

    @Override
    public void registerAmericanSeller(AmericanSeller seller) {
        this.seller = seller;
    }

    @Override
    public void registerFrenchBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    @Override
    public void registerSwedishBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    @Override
    public boolean placeBid(float bit, String unitOfCurrency) {
        return this.seller.isBidAccepted(this.dollarConverter.convertCurrencyToDollars(bit,unitOfCurrency));
    }

    @Override
    public void registerDollarConverter(DollarConverter dollarConverter) {
        this.dollarConverter = dollarConverter;
    }
}

