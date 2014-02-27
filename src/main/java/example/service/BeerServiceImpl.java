package example.service;

import com.couchbase.client.protocol.views.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import example.domain.Beer;

import java.util.List;

@Component("beerService")
public class BeerServiceImpl implements BeerService {

    private static final int DEFAULT_LIMIT = 100;

    @Autowired
    private BeerRepository beerRepository;

    @Override
    public List<Beer> allBeers() {
        return allBeers(DEFAULT_LIMIT);
    }

    @Override
    public List<Beer> allBeers(int limit) {
        Query query = new Query();
        query.setLimit(limit);
        return beerRepository.all(query);
    }

}
