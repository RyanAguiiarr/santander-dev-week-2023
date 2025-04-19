package me.ryan.santander_dev_week_2023.service;

import me.ryan.santander_dev_week_2023.domain.models.User;

public interface UserService {

    User findById(Long id);
    User create(User userToCreate);
}
