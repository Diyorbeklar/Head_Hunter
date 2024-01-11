package Example.service;

import Example.model.Country;

import java.util.List;

public interface countryservice {
    Country getCountryById(Integer id);
    List<Country> getMaxsulotList();

    void createCountry(Country country);
    void updateCountry(Integer id, Country country);
    void deleteCountry(Integer id);
}
