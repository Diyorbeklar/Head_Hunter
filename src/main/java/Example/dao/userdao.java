package Example.dao;

import Example.model.Country;
import Example.model.User;

import java.util.List;

public interface userdao {
    Country getUserById(Integer id);
    List<User> getUserList();

    void createUser(User user);
    void updateUser(Integer id, User user);
    void deleteUser(Integer id);
}
