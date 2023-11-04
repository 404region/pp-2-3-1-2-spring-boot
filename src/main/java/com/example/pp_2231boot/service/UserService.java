package com.example.pp_2231boot.service;



import com.example.pp_2231boot.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void saveUser(User user);
    void updateUser(User user);

    void deleteById(Long id);

    User findById(Long id);
}
