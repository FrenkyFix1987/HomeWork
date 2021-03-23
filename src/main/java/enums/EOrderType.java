package enums;

public enum EOrderType {
    BID("BID"),
    OFFER("OFFER");

    public final String type;

    EOrderType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return this.type;
    }
}
