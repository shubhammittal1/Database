package MongoDB.Database.Service;

import MongoDB.Database.collection.Details;
import MongoDB.Database.repository.DetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetailsServiceImpl implements DetailsService {
    @Autowired
    private DetailsRepo detailsRepo;

    @Override
    public String save(Details details) {
        return detailsRepo.save(details).getDetailsId();
    }
    @Override
    public List<Details> getDetailsStart(String name){
        return detailsRepo.findByFirstName(name);
    }
}
