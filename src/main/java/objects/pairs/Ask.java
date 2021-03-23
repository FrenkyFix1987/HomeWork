package objects.pairs;

import objects.orders.Order;

import java.util.Date;

public class Ask implements Pairs {

    private String trend;
    private float price;
    private int quantity;

    public String getTrend() {
        return trend;
    }

    public void setTrend(String trend) {
        this.trend = trend;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
