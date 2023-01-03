package MongoDB.Database.collection;

import lombok.Data;

@Data
public class Address {
    private String country;
    private String State;
    private String city;
    private String pincode;

    public Address(String country, String state, String city, String pincode) {
        this.country = country;
        State = state;
        this.city = city;
        this.pincode = pincode;
    }
}
