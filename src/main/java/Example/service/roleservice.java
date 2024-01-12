package Example.service;

import Example.model.Country;
import Example.model.Role;

import java.util.List;

public interface roleservice {
    Country getRoleById(Integer id);
    List<Country> getRoleList();

    void createRole(Role role);
    void updateRole(Integer id, Role role);
    void deleteRole(Integer id);
}
