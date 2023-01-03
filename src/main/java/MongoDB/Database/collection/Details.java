package MongoDB.Database.collection;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Details {
    @Id
   private String detailsId;
    private String firstName;
    private String lastName;
    private Long contact;
    private Address address;

    public Details(String firstName, String lastName, Long contact,Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.contact = contact;
        this.address = address;
    }
}
