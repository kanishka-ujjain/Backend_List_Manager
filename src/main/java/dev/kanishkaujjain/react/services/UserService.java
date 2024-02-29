package dev.kanishkaujjain.react.services;

import dev.kanishkaujjain.react.payloads.UserDAO;

import java.util.List;

public interface UserService {

    UserDAO createUser(UserDAO userDAO);
    UserDAO updateUser(UserDAO user, Integer userId);
    UserDAO getUserById(Integer userId);
    List<UserDAO> getAllUsers();
    void deleteUser(Integer userId);
}
