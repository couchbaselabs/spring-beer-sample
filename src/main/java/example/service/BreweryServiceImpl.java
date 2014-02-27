package example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import example.domain.Brewery;

@Component("breweryService")
public class BreweryServiceImpl implements BreweryService {

    @Autowired
    private BreweryRepository breweryRepository;

    @Override
    public Brewery find(String id) {
        return breweryRepository.findOne(id);
    }
}
