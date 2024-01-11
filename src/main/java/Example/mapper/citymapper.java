package Example.mapper;

import Example.model.City;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class citymapper implements RowMapper<City> {
    public City mapRow(ResultSet rs, int rowNum) throws SQLException {
        City city = new City();
        city.setId(rs.getInt("id"));
        city.setName(rs.getString("name"));
        city.setCountry_id(rs.getInt("country_id"));
        return city;
    }


}
