package Example.dao;

import Example.model.Country;
import Example.model.Role_permission;

import java.util.List;

public interface role_permissiondao {
    Country getRolePermissionById(Integer id);
    List<Role_permission> getRolePermissionList();

    void createRolePermission(Role_permission rolePermission);
    void updateRolePermission(Integer id, Role_permission rolePermission);
    void deleteRolePermission(Integer id);
}
