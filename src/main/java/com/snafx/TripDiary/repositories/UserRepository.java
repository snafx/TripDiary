package com.snafx.TripDiary.repositories;

import com.snafx.TripDiary.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long>{
}
