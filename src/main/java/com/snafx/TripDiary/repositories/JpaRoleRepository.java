package com.snafx.TripDiary.repositories;

import com.snafx.TripDiary.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaRoleRepository extends JpaRepository<Role, Long> {
}
