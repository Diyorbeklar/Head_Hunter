package Example.service;

import Example.dao.countryimpl;
import Example.model.Company;
import Example.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class countryserviceimpl implements countryservice{
    @Autowired
    private countryimpl countryimpl;

    @Override
    public Country getCountryById(Integer id) {
        System.out.println("service");
        return countryimpl.selectCountryById(id);
    }

    @Override
    public List<Country> getMaxsulotList() {
        return countryimpl.selectAllCountry();
    }

    @Override
    public void createCountry(Country country) {
        countryimpl.insertCountry(country);
    }

    @Override
    public void updateCountry(Integer id, Country country) {
        countryimpl.updateCountry(id,country);
    }

    @Override
    public void deleteCountry(Integer id) {
        countryimpl.deleteCountry(id);
    }
}
