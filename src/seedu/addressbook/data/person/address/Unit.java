package seedu.addressbook.data.person.address;

public class Unit {
    private final String unit;

    public Unit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return unit;
    }
}
