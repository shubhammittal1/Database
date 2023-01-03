package MongoDB.Database.Service;

import MongoDB.Database.collection.Details;

import java.util.List;

public interface DetailsService {
    abstract String save(Details details);

    List<Details> getDetailsStart(String name);
}
