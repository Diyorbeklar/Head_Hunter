package Example.dao;

import Example.mapper.countrymapper;
import Example.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class countryimpl implements countrydao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Country selectCountryById(Integer id) {
        System.out.println("dao");
        return (Country) jdbcTemplate.queryForObject("SELECT * FROM COUNTRY WHERE id=?",new Object[]{id},new countrymapper());
    }

    @Override
    public List<Country> selectAllCountry() {
        return jdbcTemplate.query("SELECT * FROM COUNTRY;",new countrymapper());
    }

    @Override
    public void insertCountry(Country country) {
        jdbcTemplate.update("INSERT INTO COUNTRY(NAME) VALUES(?);",country.getName());
    }

    @Override
    public void updateCountry(Integer id, Country country) {
        jdbcTemplate.update("UPDATE COUNTRY SET name = ? WHERE id = ?;",country.getName(),id);
    }

    @Override
    public void deleteCountry(Integer id) {
         jdbcTemplate.update("DELETE FROM COUNTRY WHERE id=?",id);
    }
}
