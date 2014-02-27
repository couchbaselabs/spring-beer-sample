package example.service;

import example.domain.Beer;

import java.util.List;

public interface BeerService {

    List<Beer> allBeers();
    List<Beer> allBeers(int limit);
}
