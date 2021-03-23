package objects.pairs;

import enums.ECurrencyPairs;
import enums.EOrderType;
import objects.orders.Bid;
import objects.orders.Offer;
import objects.orders.Order;

public class PairsFactory {
    public Order getOrderObject(){
        if(ECurrencyPairs.EUR_RUB.toString().contains("EUR/RUB")){
            return new Bid();

        } else if(ECurrencyPairs.EUR_USD.toString().contains("EUR/USD")) {
            return new Offer();
        }
        return null;
    }
}
