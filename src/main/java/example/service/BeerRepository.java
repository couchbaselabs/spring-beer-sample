package example.service;

import com.couchbase.client.protocol.views.Query;
import org.springframework.data.repository.CrudRepository;
import example.domain.Beer;

import java.util.List;

public interface BeerRepository extends CrudRepository<Beer, String> {

    List<Beer> all(Query query);

}
