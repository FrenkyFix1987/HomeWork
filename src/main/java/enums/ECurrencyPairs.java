package enums;

public enum ECurrencyPairs {
    EUR_USD("EUR/USD"),
    EUR_RUB("EUR/RUB");

    public final String type;

    ECurrencyPairs(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return this.type;
    }
}
