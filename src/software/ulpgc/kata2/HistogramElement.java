package software.ulpgc.kata2;

public class HistogramElement {
    private final String field;
    private final int value;

    public HistogramElement(int field, int value) {
        this.field = String.valueOf(field);
        this.value = value;
    }

    public String getField() {
        return field;
    }

    public int getValue() {
        return value;
    }
}
