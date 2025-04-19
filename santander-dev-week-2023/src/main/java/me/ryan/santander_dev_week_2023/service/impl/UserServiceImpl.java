package me.ryan.santander_dev_week_2023.service.impl;

import me.ryan.santander_dev_week_2023.domain.models.User;
import me.ryan.santander_dev_week_2023.domain.repository.UserRepositoty;
import me.ryan.santander_dev_week_2023.service.UserService;
import org.springframework.stereotype.Service;
import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepositoty userRepositoty;

    public UserServiceImpl(UserRepositoty userRepositoty) {
        this.userRepositoty = userRepositoty;
    }

    @Override
    public User findById(Long id) {
        return userRepositoty.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if(userToCreate.getId() != null && userRepositoty.existsById(userToCreate.getId())){
            throw new IllegalArgumentException("Usuário já extente com o id: " + userToCreate.getId());
        }
        return userRepositoty.save(userToCreate);
    }
}
