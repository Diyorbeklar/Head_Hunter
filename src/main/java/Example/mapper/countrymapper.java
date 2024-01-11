package Example.mapper;

import Example.model.Company;
import Example.model.Country;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


    public class countrymapper implements RowMapper<Country> {
        public Country mapRow(ResultSet rs, int rowNum) throws SQLException {
            Country country = new Country();
            country.setId(rs.getInt("id"));
            country.setName(rs.getString("name"));
            return country;
        }



}
