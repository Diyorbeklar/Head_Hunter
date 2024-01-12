package Example.service;

import Example.model.Country;

import java.util.List;

public interface role_permissionservice {
    Country getRolePermissionById(Integer id);
    List<Country> getRolePermissionList();

    void createRolePermisson(Country country);
    void updateRolePermission(Integer id, Country country);
    void deleteRolePermission(Integer id);
}
