package Example.dao;

import Example.model.Company;
import Example.model.Country;

import java.util.List;

public interface countrydao {
    public Country selectCountryById(Integer id);
    public List<Country> selectAllCountry();
    void insertCountry(Country country);
    void updateCountry(Integer id, Country country);
    void deleteCountry(Integer id);

}
