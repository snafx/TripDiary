package com.snafx.TripDiary.repositories;

import com.snafx.TripDiary.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaUserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
