package Example.mapper;

import Example.model.Role_permission;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class role_permissionmapper implements RowMapper<Role_permission> {

    @Override
    public Role_permission mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Role_permission(rs.getInt("role_id"),rs.getInt("permission_id"));
    }
}
