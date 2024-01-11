package Example.mapper;

import Example.model.City;
import Example.model.Company;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class companymapper implements RowMapper<Company> {
    public Company mapRow(ResultSet rs, int rowNum) throws SQLException {
        Company company = new Company();
        company.setId(rs.getInt("id"));
        company.setName(rs.getString("name"));
        company.setCity_id(rs.getInt("city_id"));
        company.setDescription(rs.getString("description"));
        company.setTel(rs.getString("tel"));
        company.setEmail(rs.getString("email"));
        return company;
    }


}
