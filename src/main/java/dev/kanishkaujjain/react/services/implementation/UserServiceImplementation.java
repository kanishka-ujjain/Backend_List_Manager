package dev.kanishkaujjain.react.services.implementation;

import dev.kanishkaujjain.react.payloads.UserDAO;
import dev.kanishkaujjain.react.repositories.UserRepo;
import dev.kanishkaujjain.react.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImplementation implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDAO createUser(UserDAO userDAO) {
        return null;
    }

    @Override
    public UserDAO updateUser(UserDAO user, Integer userId) {
        return null;
    }

    @Override
    public UserDAO getUserById(Integer userId) {
        return null;
    }

    @Override
    public List<UserDAO> getAllUsers() {
        return null;
    }

    @Override
    public void deleteUser(Integer userId) {

    }
}
