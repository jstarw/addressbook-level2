package seedu.addressbook.data.person.address;

public class Street {
    private final String street;

    public Street(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return street;
    }
}
