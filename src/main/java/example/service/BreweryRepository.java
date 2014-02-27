package example.service;

import org.springframework.data.repository.CrudRepository;
import example.domain.Brewery;

public interface BreweryRepository extends CrudRepository<Brewery, String> {
}
