package objects.pairs;

import java.util.Date;

public interface Pairs {

    float getPrice();

    void setPrice(float price);

    int getQuantity();

    void setQuantity(int quantity);

    String getTrend();

    void setTrend(String trend);
}
