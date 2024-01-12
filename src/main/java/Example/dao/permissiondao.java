package Example.dao;

import Example.model.Country;
import Example.model.Permission;

import java.util.List;

public interface permissiondao {
    Country getPermissionById(Integer id);
    List<Permission> getPermissionList();

    void createPermission(Permission permission);
    void updatePermission(Integer id, Permission permission);
    void deletePermission(Integer id);
}
