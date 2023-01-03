package MongoDB.Database.repository;

import MongoDB.Database.collection.Details;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
    public interface DetailsRepo extends MongoRepository<Details,String> {
    List<Details> findByFirstName(String name);
    }
