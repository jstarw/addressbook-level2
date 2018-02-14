package seedu.addressbook.data.person.address;

public class PostalCode {
    private final String postalCode;

    public PostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return postalCode;
    }
}
