package Example.service;

import Example.model.Country;

import java.util.List;

public interface permissionservice {
    Country getPermissionById(Integer id);
    List<Country> getPermissionList();

    void createPermission(Country country);
    void updatePermission(Integer id, Country country);
    void deletePermission(Integer id);
}
