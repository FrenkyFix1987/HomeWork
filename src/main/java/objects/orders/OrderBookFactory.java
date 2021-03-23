package objects.orders;

import enums.EOrderType;

public class OrderBookFactory {
    public Order getOrderObject(){
        if(EOrderType.BID.toString().contains("BID")){
            return new Bid();

        } else if(EOrderType.OFFER.toString().contains("OFFER")) {
            return new Offer();
        }
        return null;
    }
}
