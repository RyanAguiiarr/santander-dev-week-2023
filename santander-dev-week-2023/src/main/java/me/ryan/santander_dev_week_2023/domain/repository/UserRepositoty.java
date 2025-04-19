package me.ryan.santander_dev_week_2023.domain.repository;

import me.ryan.santander_dev_week_2023.domain.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositoty extends JpaRepository<User, Long> {
}
