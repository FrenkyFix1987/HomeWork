package objects.orders;

import java.util.Date;

public class Bid implements Order{
    private Date time;
    private boolean is_bid;
    private int id;
    private float price;
    private int quantity;
    private String venue;

    public Date getTime() {
        return time;
    }

    public void setTime(Date timestamp) {
        this.time = timestamp;
    }

    public boolean isIs_bid() {
        return is_bid;
    }

    public void setIs_bid(boolean is_bid) {
        this.is_bid = is_bid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

}
