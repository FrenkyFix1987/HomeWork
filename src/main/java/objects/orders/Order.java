package objects.orders;

import java.util.Date;

public interface Order {
    Date getTime();

    void setTime(Date time);

    boolean isIs_bid();

    void setIs_bid(boolean is_bid);

    int getId();

    void setId(int id);

    float getPrice();

    void setPrice(float price);

    int getQuantity();

    void setQuantity(int quantity);

    String getVenue();

    void setVenue(String venue);
}
